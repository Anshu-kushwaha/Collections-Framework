import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // Thread-safe
        // Copy-On-Write Mechanism
        // No Duplicate Elements
        // Iterators Do Not Reflect Modification

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++){
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);  // for iteration and stability
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);  // for frequent read and write

        System.out.println("\nIterating and modifying CopyOnWriteArraySet: ");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // attempting to modify the set during iteration
            copyOnWriteSet.add(6);
        }
        // System.out.println(copyOnWriteSet);
        System.out.println("\nIterating and modifying ConcurrentSkipListSet: ");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            // attempting to modify the set during iteration
            concurrentSkipListSet.add(6);   // concurrentSkipListSet --> weakly consistent
        }
    }
}
