package tree;

public class OrderBTree implements Visits{


    public void goLeft(Tree root){
        Tree currentTree = root;
        while (currentTree.hasLeftTree()){
            System.out.println(currentTree.getRootData());
            currentTree = currentTree.getLeftChild();
        }
        System.out.println(currentTree.getRootData());

    }

    @Override
    public void visit(Tree Tree) {
        System.out.print(Tree.getRootData() + "\t");
    }

}
