package tree;

public class TreeImpl implements Tree {
    private Object data;
    private Tree lChild;
    private Tree rChild;

    public TreeImpl() {
        this.clearTree();
    }

    public TreeImpl(Object data) {
        this.data = data;
        this.lChild = null;
        this.rChild = null;
    }

    @Override
    public void addLeftTree(Tree lChild) {
        this.lChild = lChild;
    }

    @Override
    public void addRightTree(Tree rchild) {
        this.rChild = rChild;
    }

    @Override
    public void clearTree() {
        this.data = null;
        this.lChild = null;
        this.rChild = null;
    }

    @Override
    public int dept() {
        return dept(this);
    }

    private int dept(Tree Tree) {
        if (Tree.isEmpty()) {
            return 0;
        } else if (Tree.isLeaf()) {
            return 1;
        } else {
            if (Tree.getLeftChild() == null) {
                return dept(Tree.getRightChild()) + 1;
            } else if (Tree.getRightChild() == null) {
                return dept(Tree.getLeftChild()) + 1;
            } else {
                return Math.max(dept(Tree.getLeftChild()), dept(Tree.getRightChild())) + 1;
            }
        }
    }

    @Override
    public Tree getLeftChild() {
        return lChild;
    }


    @Override
    public Tree getRightChild() {
        return rChild;
    }

    @Override
    public Object getRootData() {
        return data;
    }

    @Override
    public boolean hasLeftTree() {
        if (lChild != null)
            return true;
        return false;
    }

    @Override
    public boolean hasRightTree() {
        if (rChild != null)
            return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if ((lChild == null && rChild == null && data == null) || this == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isLeaf() {
        if (lChild == null && rChild == null) {
            return true;
        }
        return false;
    }

    @Override
    public void removeLeftChild() {
        lChild = null;
    }

    @Override
    public void removeRightChild() {
        rChild = null;
    }

    @Override
    public Tree root() {
        return this;
    }

    @Override
    public void setRootData(Object data) {
        this.data = data;
    }

    @Override
    public int size() {
        return size(this);
    }

    private int size(Tree Tree) {
        if (Tree == null)
            return 0;
        else if (Tree.isLeaf())
            return 1;
        else {
            if (Tree.getLeftChild() == null) {
                return size(Tree.getRightChild()) + 1;
            } else if (Tree.getRightChild() == null) {
                return size(Tree.getLeftChild()) + 1;
            } else {
                return size(Tree.getLeftChild()) + size(Tree.getRightChild()) + 1;
            }
        }
    }


}
