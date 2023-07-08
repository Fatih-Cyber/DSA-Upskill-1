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
    void insertFirst(UserNode node){
        // Case 1: List is Empty
        if (isEmpty()) {
            head=tail=node;
        } else {
           node.next=head;// Case 2: Not empty
           head=node;
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
    void deleteByName(String name){
        // check if list is empty
        if(isEmpty()) { System.out.println("List is empty");
        return;
        }
        UserNode prev=head;
        UserNode current=head;
        while(current!=null){
            if (current.name.equals(name)){
                // case1: Head
                if (current==head){
                    // head and tail might be same (only one element)
                    if(head==tail) tail=null;
                    head=current.next;//null
                    current.next=null;// for breaking link between current and next
                } else if (current==tail){
                    // case2 : Tail
                    prev.next=null;
                    tail=prev;
                } else {
                    // case3: Middle
                    prev.next=current.next;
                    current.next=null;
                }
                size--;
            }
            // move to next nodes
            prev=current;
            current=current.next;

        }

    }
}
