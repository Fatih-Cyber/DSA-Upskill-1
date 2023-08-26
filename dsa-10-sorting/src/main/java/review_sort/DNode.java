package review_sort;

public class DNode { // Node class for doubly linked list
    int key;
    int value;
    DNode prev; // Reference type
    DNode next;

    public DNode(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public DNode() {
    }
}
