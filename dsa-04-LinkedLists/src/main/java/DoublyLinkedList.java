public class DoublyLinkedList {
        public Node head;
        public Node tail;

    class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

       public void insert(int value){
               Node nodeToInsert=new Node(value);
               if (head==null) {
                  head=nodeToInsert;
                 nodeToInsert.prev=null;
                 nodeToInsert.next=null;
                  tail=nodeToInsert;
               }else {
                tail.next=nodeToInsert;
                nodeToInsert.next=null;
                nodeToInsert.prev=tail;
                tail=nodeToInsert;
               }
       }
        public void setHead(Node node) {
                if (head == null) {
                        head = node;
                        tail = node;
                        return;
                }
        }
        public void setTail (Node node){
                        if (tail == null) {
                                setHead(node);
                                return;
                        }
                        insertAfter(tail, node);
                }
                public void insertBefore(Node node, Node nodeToInsert){
                        nodeToInsert.prev = node.prev;
                        nodeToInsert.next = node;
                        if (node.prev == null) {
                                head = nodeToInsert;
                        } else {
                                node.prev.next = nodeToInsert;
                        }
                        node.prev = nodeToInsert;
                }
                public void insertAfter(Node node, Node nodeToInsert){
                        nodeToInsert.prev = node;
                        nodeToInsert.next = node.next;
                        if (node.next == null) {
                                tail = nodeToInsert;
                        } else {
                                node.next.prev = nodeToInsert;
                        }
                        node.next = nodeToInsert;
                }
                public void insertAfterValue (int value,int valueToInsert){
                        Node newNode=new Node(valueToInsert);
                        Node current=head;
                        while(current!=null){
                           if (current.value==value) {
                               newNode.prev = current;
                               newNode.next = current.next;
                               if (current.next == null) {
                                   tail = newNode;
                               } else {
                                   current.next.prev = newNode;
                               }
                               current.next = newNode;
                               break;
                           }
                           current=current.next;
                        }
                }
                public void insertAtPosition ( int position, Node nodeToInsert){
                        if (position == 1) {
                                setHead(nodeToInsert);
                                return;
                        }
                        Node current = head;
                        int currentPosition = 1;
                        while (current != null && currentPosition++ != position) current = current.next;
                        if (current != null) {
                                insertBefore(current, nodeToInsert);
                        } else {
                                setTail(nodeToInsert);
                        }
                }
    public void insertAtPosition ( int position, int value){
           Node nodeToInsert=new Node(value);
        if (position == 1) {
            setHead(nodeToInsert);
            return;
        }
        Node current = head;
        int currentPosition = 1;
        while (current != null && currentPosition++ != position) current = current.next;
        if (current != null) {
            insertBefore(current, nodeToInsert);
        } else {
            setTail(nodeToInsert);
        }
    }
                public void removeNodesWithValue ( int value){
                        Node current = head;
                        while (current != null) {
                                Node nodeToRemove = current;
                                current = current.next;
                                if (nodeToRemove.value == value) remove(nodeToRemove);
                        }
                }
                public void remove (Node node){
                        if (node == head) head = head.next;
                        if (node == tail) tail = tail.prev;
                        removeNodeBindings(node);
                }

                public int indexOf ( int value){
                        if (head==null) return-1 ;
                        else {
                                int index=0;
                                Node current=head;
                                while(current!=null){
                                  if (current.value==value) return index;
                                }
                        }
                        return -1;
                }
                public boolean containsNodeWithValue ( int value){
                        // Write your code here.
                        return false;
                }
        public void printNodes(){
               Node current=head;
               while(current!=null){
                   if (current.next==null) System.out.print(current.value+"->"+"null");
                     else  System.out.print(current.value+"->");
                     current=current.next;
               }
        }
        public void removeNodeBindings(Node node) {
                if (node.prev != null) node.prev.next = node.next;
                if (node.next != null) node.next.prev = node.prev;
                node.prev = null;
                node.next = null;
        }


}
