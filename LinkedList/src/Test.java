import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2); // O(n)
        linkedList.addLast(4); // O(1)
        linkedList.addFirst(0); // O(1)
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x% 2 ==0);  // if condition met then print linkedList
        System.out.println(linkedList);

        // To Remove All -> desired indexs

        LinkedList <String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Lion", "Tiger"));  // we can also create linkedlist from it
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat", "Tiger"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }

}