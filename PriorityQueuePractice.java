import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);
        pq.offer(40);
        
        System.out.println("Priority Queue: " + pq);
        System.out.println("Smallest element: " + pq.peek());

        int removed = pq.poll();
        System.out.println("Removed element: " + removed);

        System.out.println("New top-priority element: " + pq.peek());
        System.out.println("Queue size: " + pq.size());
        System.out.println("Final Queue: " + pq);
    }
}
