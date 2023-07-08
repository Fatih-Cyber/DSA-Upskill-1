package Review3_LinkedLists;

public class UserListApp {
    public static void main(String[] args) {
        UserNode node1=new UserNode("Alexander","Smith");
        UserLinkedList myLinkedListSingle=new UserLinkedList();
        myLinkedListSingle.insertLast(node1);
    }
}
