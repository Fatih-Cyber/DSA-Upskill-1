public class MergeTwoLinkedList{
    public static Node mergeLinkedLists(Node headOne, Node headTwo) {
        Node p1 = headOne;
        Node p1Prev = null;
        Node p2 = headTwo;
        while (p1 != null && p2 != null) {
            if (p1.id< p2.id) {
                p1Prev = p1;
                p1 = p1.next;
            } else {
                if (p1Prev != null) p1Prev.next = p2;
                p1Prev = p2;
                p2 = p2.next;
                p1Prev.next = p1;
            }
        }
        if (p1 == null) p1Prev.next = p2;
        return headOne.id < headTwo.id ? headOne : headTwo;
    }
}
