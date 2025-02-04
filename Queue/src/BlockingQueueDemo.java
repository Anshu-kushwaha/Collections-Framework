import java.util.Comparator;
import java.util.concurrent.*;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced : " + value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed : " + value);
                queue.put(value);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);  // 5 -> fixed size & not increasing
        // A bounded, blocking queue backed by an array
        // low memory overhead
        // uses a single lock for both enqueue and dequeue operations
        // more threads --> problem
//        Thread producer = new Thread(new Producer(queue));
//        Thread consumer = new Thread(new Consumer(queue));
//        producer.start();
//        consumer.start();

        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>(100);
        // optionally bounded backed by LinkedList
        // uses two separate locks for enqueue and dequeue operations
        // higher concurrency between producers and consumers
        // have same methods

        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // not sorted
        // unbounded
        // binary heap as array & can grow dynamically
        // head are ordered based on their natural ordering or a provided Comparator like priority queue
        // same as priority queue
        // put won't block
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");
        System.out.println(queue2);




        // thread-safety queue
        // wait for queue to become non-empty / wait for space
        // simplify concurrency problems like producer-consumer
        // standard queue --> immediately
            // empty --> remove ( no waiting )
            // full --> add ( no waiting )
        // Blocking queue
            // put --> Blocks if the queue is full until space becomes available.
            // take --> Blocks if the queue is empty until an element becomes available.
            // offer --> Waits for space to become available, UP to the specified timeout.

    }
}
