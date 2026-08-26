import java.util.PriorityQueue;
import java.util.Collections;

public class MaxPriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        pq.offer(40);
        
        System.out.println("Priority Queue: " + pq);
        System.out.println("Largest element: " + pq.peek());

        int removed = pq.poll();
        System.out.println("Removed element: " + removed);

        System.out.println("New top-priority element: " + pq.peek());
        System.out.println("Queue size: " + pq.size());
        System.out.println("Final Queue: " + pq);
    }
}
