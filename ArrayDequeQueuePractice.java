import java.util.Queue;
import java.util.ArrayDeque;
public class ArrayDequeQueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);
        int removed = queue.poll() ;
        System.out.println("Removed element: " + removed);
        System.out.println("Front: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println("30 exists : " + queue.contains(30));
        System.out.println(queue);
    }
}