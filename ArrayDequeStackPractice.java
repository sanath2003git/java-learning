import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeStackPractice {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        int removed = stack.pop() ;
        System.out.println("Popped element: " + removed);
        System.out.println("Top: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("30 exists : " + stack.contains(30));
        System.out.println(stack);
 
    }
}
