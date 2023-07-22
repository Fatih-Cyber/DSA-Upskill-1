import java.util.LinkedList;

public class LinkedListWithCollection {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();

        for (int i = 0; i < 6; i++) {
            linkedList.add(i);
        };

    linkedList.forEach(System.out::println);
    }
}
