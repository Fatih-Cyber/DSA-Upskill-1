package Review3_LinkedLists;

import java.sql.SQLOutput;

public class Review3SllExample {
    public static void main(String[] args) {
  CarX car=new CarX("Audi");
  NodeX node= new NodeX(1);
        System.out.println("Name of the car: " + car.Brand + " Address is: "+ car);
        System.out.println("Next address of node is: "+ node.next);

        node.next=car;
        System.out.println("Next address of node after linking is: "+ node.next);



    }
}
