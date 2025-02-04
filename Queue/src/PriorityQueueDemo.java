import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Part of Queue interface.
        // Orders elements based on their natural ordering (For primitive lowest first).
        // Custom comparator for customised ordering.
        // Doesn't allow null elements.

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq); // not sorted
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}

