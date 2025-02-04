import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa.
        // it can't store elements. capacity of at most one element
        BlockingQueue<String> queue = new SynchronousQueue<>();
        Thread producer = new Thread (() -> {
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from producer!");
                System.out.println("Producer has transferred the message.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("producer was interrupted.");
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting to receive...");
                String message = queue.take();
                System.out.println("Consumer received : " + message);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted.");
            }
        });
        consumer.start();
        producer.start();
    }
}