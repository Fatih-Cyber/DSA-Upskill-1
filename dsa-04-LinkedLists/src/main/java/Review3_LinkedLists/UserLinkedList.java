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
        } else {
            tail.next=node;// Case 2: Not empty
            tail=node;
        }
        size++;
    }

    void printNames(){
        // first check if list is empty
        if (isEmpty()) {
            System.out.println("List is empty !!!!");
            return;
        }
        // Go to the first element in the list
        UserNode current=head;
        System.out.println();
        while (current!=null) {
            System.out.print(current.name+ " => ");
            current=current.next;
            if (current==null) System.out.print("null");
        }

    }
}
