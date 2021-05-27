package tree;

public class Test {
    public static void main(String args[]) {
        Tree Tree = new TreeImpl("GranGranGranMa noOneRememberName)");
        Tree bt1, bt2, bt3;
        bt1 = new TreeImpl("GranGranMa Lilia");
        Tree.addLeftTree(bt1);
        bt2 = new TreeImpl("GranMa Oksana");
        bt1.addLeftTree(bt2);

        bt3 = new TreeImpl("Ma Zina");
        bt2.addLeftTree(bt3);


        System.out.println("Tree depth:" + Tree.dept());
        System.out.println("Number of nodes in the tree:" + Tree.size());
        System.out.println("Is this a leaf node:" + Tree.isLeaf());
        System.out.println("Root node:" + Tree.root());

        OrderBTree order = new OrderBTree();
        System.out.println("\n Go Left:");
        order.goLeft(Tree);
    }
}
