import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }
    void insert(int value){
        TNode newNode=new TNode(value);
        if (root==null) {
            root=newNode;
            return;
        }
        TNode current =root;
        while(true){
            if (value<= current.value){

                if (current.leftChild==null){
                    // if left is null insert there!!!
                    current.leftChild=newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current=current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    // if right is null insert there!!!
                    current.rightChild=newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current=current.rightChild;
            }
        }
    }
    // PreOrder Traversal of the tree
    // Root-Left-right
    void preOrderTraversal(TNode root){
        if(root==null) return;// termination
        System.out.print(root.value +", "); // visit root
        preOrderTraversal(root.leftChild);  // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree
    }
    void inOrderTraversal(TNode root){
        if (root==null) return; // termination
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }
    void postOrderTraversal(TNode root){
        if (root==null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value+", ");  // visit root
    }
    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode>  queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }
    public boolean isLeaf(TNode node) {
        return node.leftChild==null && node.rightChild==null;
    }
    public void printLeaves(TNode root){
        if (root==null) return;
        // perform visit on Root

        // Recursively Branch Left Subtree
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
        if (isLeaf(root)) System.out.print(root.value + ", ");

        // Recursively Branch Right Subtree
    }
    int countLeaves(TNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return 1;
        // recursively left
        // recursively right
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }
    int findSumOfLeaves(TNode root){
        if (root==null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }
    int height(TNode root){
        if (root==null) return -1;
        if (isLeaf(root)) return 0;
        return 1+ Math.max(height(root.leftChild), height(root.rightChild));
    }
    public int calculateNodeDepthSums(){
        return nodeDepthSums(root, 0);
    }
    // Assignment  Sum of Node Depths
    public int nodeDepthSums(TNode node, int A){
        if(node==null) return 0;
        System.out.println(A);
        return A+nodeDepthSums(node.leftChild, A+1) +nodeDepthSums(node.rightChild, A+1);
    }
    // Assignment  Sum of All Nodes recursively
    public int calculateNodeSums(){
        return nodeSums(root);
    }

    public int nodeSums(TNode node){
        if(node==null) return 0;

        return node.value+ nodeSums(node.leftChild)+nodeSums(node.rightChild);
    }
    // Sum of all Nodes

}
