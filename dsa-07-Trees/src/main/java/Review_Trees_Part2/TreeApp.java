package Review_Trees_Part2;

import java.security.spec.RSAOtherPrimeInfo;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i <11; i++) {
            tree.insert(numbers[i]);
        }
      VisualizeTree.printTree(tree.root,null,false);
        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println(tree.height(tree.root.leftChild));
        System.out.println("Count of leaf nodes:  "+tree.countLeaves(tree.root));
        System.out.println("Sum of leaf Node values:  " + tree.findSumOfLeaves(tree.root));
        System.out.println("Sum of nodes : "+ tree.nodeSums(tree.root));
        /*tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In Order Traversal :");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post Order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Level Order Traversal: ");
        tree.levelOrderTraversal();*/



    }
}
