package Review_Trees_Part1;

public class TreeApp {
    public static void main(String[] args) {
        TreeClass tree=new TreeClass();
        System.out.println(tree.root);
        tree.insert(new TreeNode("John", "locke",5));
        tree.insert(new TreeNode("Carol", "smith",3));
        tree.insert(new TreeNode("Betul", "QQ",6));
        tree.insert(new TreeNode("Kadifa", "WW",4));
        tree.preOrderTraversal(tree.root);
    }
}
