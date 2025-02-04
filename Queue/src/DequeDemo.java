import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        // double-ended queue
        // allows insertion and removal of elements from both ends
        // versatile than regular queues and stacks because they support all the operations of both\

        /*
        INSERTION METHODS

        addFirst(E e) : Inserts the specified elements at the front.
        addLast(E e) : Inserts the specified elements at the end.
        offerFirst(E e) : Inserts the specified elements at the front if possible.
        offerLast(E e) : Inserts the specified element at the end if possible

        REMOVAL METHODS

        removeFirst () : Retrieves and removes the first elements.
        removeLast() : Retrieves and removes the last elements.
        pollFirst() : Retrieves and removes the first element, or return null if empty.
        pollLast() : Retrieves and removes the last element, or return null if empty.

        EXAMINATION METHODS

        getFirst() : Retrieves, but doesn't remove, the first element.
        getLast() : Retrieves, but doesn't remove, the last element.
        peekFirst() : Retrieves, but doesn't remove, the first element, or returns null if empty.
        peekLast() : Retrieves, but doesn't remove, the last element, or returns null if empty.


        STACK METHODS

        push(E e) : Adds an element at the front (equivalent or addFirst(E e)).
        pop(): Removes and returns the first element (equivalent to removeFirst()).
        */

        Deque<Integer> dq1 = new ArrayDeque<>(); // faster iteration, low memory, no null allowed
        // always use ArrayDeque while using deque
        // circular array -> head & tail
        // no need to shift elements, just shift head and tail
        dq1.addFirst(12); // head--
        dq1.addLast(20);
        dq1.offerFirst(35);
        dq1.offerLast(5);
        System.out.println(dq1);
        System.out.println("First element: " + dq1.getFirst());
        System.out.println("Last element: " + dq1.getLast());
        dq1.removeFirst();
        dq1.pollLast();  // remove last
        for (int num : dq1) {
            System.out.println(num);
        }

        Deque<Integer> dq2 = new LinkedList<>();
        // we use LinkedList while insertion and deletion somewhere in middle
    }
}
