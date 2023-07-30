package Review_Trees_Part1;

public class TreeClass {
    TreeNode root;

    public TreeClass() {
        //Why default is null? Reference types? Null
    }
    public void insert(TreeNode newNode){
        //Tree can be empty
        if (root==null) {
            root=newNode;
            return;
        }
        TreeNode current=root;
        while (true) {
            if(newNode.id<= current.id){
                if(current.leftChild==null){
                    //make insertion
                    current.leftChild=newNode;//if left is null where you cannot branch left
                    break;
                }
                current=current.leftChild;// if left child is not null branch left
            }else {
                if(current.rightChild==null){
                    //make insertion if right is null where you cannot branch right
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;// if right child is not null branch right
            }
        }
    }
}
