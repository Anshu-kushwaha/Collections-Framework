import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverView {
    public static void main(String[] args) {
        // set is a collections that cannot contains duplicate elements
        // faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet  --> these aren't thread safe

        /*Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(8);
        System.out.println(set);

        --> HashSet print in unordered
        */

        /*Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(8);
        System.out.println(set);

        LinkedHashSet print in ordered

         */
        Set<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(8);
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(1));
        System.out.println(set);
        set.clear();
        System.out.println(set.isEmpty());
        for (int i: set) {
            System.out.println(i);
        }
        // TreeSet prints in sorted manner
        // Both have same methods so use as like u want. only put replace in add.

                                    //  FOR THREAD SAFETY

        Set<Integer> set1 = new ConcurrentSkipListSet<>();  // --> use it always bcz it has built-in thread safety

                                             // Unmodifiable

        Set<Integer> integers = Set.of(1, 2, 3,4,5,6,7,8,9,0,11,22,33,44,55,66); // we can add more than 10 entries

    }
}