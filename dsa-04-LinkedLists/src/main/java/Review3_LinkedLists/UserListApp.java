package Review3_LinkedLists;

public class UserListApp {
    public static void main(String[] args) {
        UserNode node1=new UserNode("Alexander","Smith");
        UserLinkedList myLinkedListSingle=new UserLinkedList();
        myLinkedListSingle.insertLast(node1);
        myLinkedListSingle.insertLast(new UserNode("Betty","Flintstone"));
        myLinkedListSingle.insertLast(new UserNode("Carol","Charlie"));
        myLinkedListSingle.insertLast(new UserNode("lastuser","UUUEnd"));
        myLinkedListSingle.printNames();
        myLinkedListSingle.insertFirst(new UserNode("SubZero","test"));
        myLinkedListSingle.printNames();
        System.out.println();
        System.out.println("Size : " +myLinkedListSingle.size);
        myLinkedListSingle.deleteByName("Carol");

        myLinkedListSingle.printNames();
        System.out.println();
        System.out.println("Size : " +myLinkedListSingle.size);


    }
}
