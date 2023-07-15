import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Deque<Integer> cStack=new LinkedList<>();
        cStack.push(1);
        cStack.push(2);  cStack.push(3);
        System.out.println(cStack.peek());
        System.out.println(cStack.pop());
        System.out.println("peek is: "+ cStack.peek());

    }
}
