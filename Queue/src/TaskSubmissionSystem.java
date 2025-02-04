import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskSubmissionSystem {
    // ConcurrentLinkedQueue -> An implementation of the Queue interface that supports lock-free, thread-safe operations
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {

        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    taskQueue.add("Task" + System.currentTimeMillis());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll();
                    System.out.println("Processing: " + task);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
