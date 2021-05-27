package tree;

public interface Tree {

    public void addLeftTree(Tree lChild);

    public void addRightTree(Tree rchild) ;

    public void clearTree();

    public int dept();

    public Tree getLeftChild();


    public Tree getRightChild();

    public Object getRootData();

    public boolean hasLeftTree();

    public boolean hasRightTree();

    public boolean isEmpty();

    public boolean isLeaf();

    public void removeLeftChild();

    public void removeRightChild();

    public Tree root();

    public void setRootData(Object data);

    public int size();
}