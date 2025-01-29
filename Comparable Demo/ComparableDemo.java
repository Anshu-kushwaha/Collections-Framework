
import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Bob", 8.5));
        list.add(new Student("Alice", 6.5));
        list.add(new Student("Donald", 3.5));
        List <Integer> number = new ArrayList<>();
        number.add(2);
        number.add(7);
        number.add(4);
        number.add(8);
        number.sort(null);
        System.out.println(number);
//        list.sort(null);
//        System.out.println(list);
    }
}
