public class NodeExampleApp {
    public static void main(String[] args) {
        MyNode nodeA=new MyNode("Node A");
        MyNode nodeB=new MyNode("Node B");
        MyNode nodeC=new MyNode("Node C");
        MyNode nodeD=new MyNode("Node D");
        nodeA.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;
        //System.out.println(nodeA.name+" " + nodeA.next.name+" " + nodeB.next.name);

       // iterate over the list i did
       MyNode current=nodeA;
       while (current!=null){
           System.out.println(current.name);
           current=current.next;
       }
    }

}
