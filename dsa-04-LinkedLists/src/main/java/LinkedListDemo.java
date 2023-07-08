import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);



        /*System.out.println("Node1's address is: " + node1 + "Node1' next address is " + node1.next);
        System.out.println("Node2's address is: " + node2 + "Node2' next address is " + node2.next);
        System.out.println("Node3's address is: " + node3 + "Node3' next address is " + node3.next);
        System.out.println("Node4's address is: " + node4 + "Node4' next address is " + node4.next);

        Node current;
        Node head = node1;
        current = head;
        while (current != null) {
            System.out.println("Id of node is: " + current.id);
            current=current.next;
        }*/
        System.out.println(node1);
        System.out.println(node1.next.id);

        Node2 a=new Node2(new Car("Audi"));
        Node2 b=new Node2(new Car("BMW"));
        a.next=b;

        Node2 current=a;
        while(current!=null){
            System.out.println(current.car.Brand);
            current=current.next;
        }
    }



}
