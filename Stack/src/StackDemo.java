import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);  // to add elements use push() method
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedElement = stack.pop();// remove last element mean top of the element
        System.out.println(stack);
        Integer peek = stack.peek(); // to see stack
        System.out.println(peek);
        System.out.println(stack);
        System.out.println(stack.isEmpty()); // return true & false if indexes are blank or not
        System.out.println(stack.size()); // check size
        int search = stack.search(3); // it will find index of 3
        //4 - index 3
        //3 - index 2
        //2 - index 1
        //1 - index 0
        System.out.println(search);


        /*
        // LinkedList as stack

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.getLast(); // equivalent to peek
        linkedList.removeLast(); // equivalent to pop
        linkedList.size();
        linkedList.isEmpty();
        System.out.println(linkedList);

        // arraylist as stack

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // equivalent to push
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.get(arrayList.size() - 1);  // equivalent to peek
        arrayList.remove(arrayList.size() - 1); // removing last element

         */



        // we can perform anything like remove stack from center and inserting in center etc.
    }
}