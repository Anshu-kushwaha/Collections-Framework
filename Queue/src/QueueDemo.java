import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        /* LinkedList<Integer> list = new LinkedList<>();  // LinkedList acts like Queue
        list.addLast(4);  // adding elements -> enqueue
        list.addLast(5);  // adding elements -> enqueue
        list.addLast(72); // adding elements -> enqueue
        list.addLast(69); // adding elements -> enqueue
        System.out.println(list);
        Integer i = list.removeFirst();  // removing elements -> Dequeue
        System.out.println(list);
        list.getFirst(); // head -> peak
        System.out.println(list);

        // to remove complexity Queue is introduced

         */
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(2);
        System.out.println(queue1.size());

        System.out.println(queue1.remove());  // shows removed elements & throw exception if empty
        System.out.println(queue1.poll());

        //System.out.println(queue1.element());  // throw exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(2)); // true
        System.out.println(queue2.offer(2)); // true

        //System.out.println(queue2.add(3));  // throw exception
        System.out.println(queue2.offer(3)); // false
    }
}