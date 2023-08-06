package Review_Trees_Part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeClass {
    TreeNode root;

    public TreeClass() {
        //Why default is null? Reference types? Null
    }

    public void insert(TreeNode newNode) {
        //Tree can be empty
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode current = root;
        while (true) {
            if (newNode.id <= current.id) {
                if (current.leftChild == null) {
                    //make insertion
                    current.leftChild = newNode;//if left is null where you cannot branch left
                    break;
                }
                current = current.leftChild;// if left child is not null branch left
            } else {
                if (current.rightChild == null) {
                    //make insertion if right is null where you cannot branch right
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;// if right child is not null branch right
            }
        }
    }

    void preOrderTraversal(TreeNode root) {
        if (root == null) return;// termination
        System.out.println(root.name); // visit/perform operation root node
        preOrderTraversal(root.leftChild);// recursive visit left subtree
        preOrderTraversal(root.rightChild);// recursively visit right subtree
    }
    void preOrderTraversalIterative(TreeNode root) {
        // check if root is null
        if(root==null) return;
        // create stack
        Stack<TreeNode> stack=new Stack<>();
        // push root into stack
        stack.push(root);
        // while loop (until stack is empty)
        while(!stack.isEmpty()){
            //pop stack
            TreeNode poppedNode=stack.pop();
            // print popped node
            System.out.print(poppedNode.name + " , ");
            // push popped node children into stack (rightchild first than left child)
            if (poppedNode.rightChild!=null) stack.push(poppedNode.rightChild);
            if (poppedNode.leftChild!=null)stack.push(poppedNode.leftChild);

        }
    }

    void inOrderTraversal(TreeNode root) {
        if (root == null) return;// termination
        inOrderTraversal(root.leftChild);//recursively visit left subtree
        System.out.println(root.name);
        inOrderTraversal(root.rightChild);// recursively visit right subtree
    }

    void postOrderTraversal(TreeNode root) {
        if (root == null) return;// termination
        postOrderTraversal(root.leftChild);//recursively visit left subtree
        postOrderTraversal(root.rightChild);// recursively visit right subtree
        System.out.println(root.name);

    }
    void levelOrderTraversal(){
        if (root==null) return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode toVisit=queue.poll();
            System.out.println(toVisit.name);
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
    }
}
