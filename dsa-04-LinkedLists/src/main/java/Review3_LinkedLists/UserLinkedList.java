package Review3_LinkedLists;

public class UserLinkedList {
    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList() {
        this.size=0;
    }
    boolean isEmpty() {return head==null;}
    void insertLast(UserNode node){
        // Case 1: List is Empty
        if (isEmpty()) {
           head=tail=node;
        } else
        { // Case 2: Not empty
            tail.next=node;
            tail=node;
        }
        size++;
    }
}
