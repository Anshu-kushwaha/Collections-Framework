import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public double getGpa() { return gpa; }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Raj", 8.5));
        students.add(new Student("Kumar", 5.7));
        students.add(new Student("Rohit", 6.5));
        students.add(new Student("Ronit", 9.5));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed();  // ->  JAVA 8's Function
              //                                                                   ^
        //                                            for print in descending order & remove it for ascending order
        students.sort(comparator); // same work as given below in else if
    /*    students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0){
                return 1;
            }else if (o2.getGpa() - o1.getGpa() < 0){
                return -1;
            }else {
                return 0;
            }
                });      */
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }


/*
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
    //    return o1.length() - o2.length(); // ascending order
        return o2.length() - o1.length(); // descending order
    }
}

//  o1    o2
// "ok" "bye"  -> s1 come before

public class Main {
    public static void main(String[] args) {

         // sorting in ascending & descending by Lambda Expression
        List<String> words = Arrays.asList("Apple", "Cherry", "Banana");
     //   words.sort(new StringLengthComparator());
        words.sort((a, b) -> b.length() - a.length() );  // lambda expression
        System.out.println(words);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);

        list.sort((a, b) -> b - a); // descending order
        System.out.println(list);

-----------------------------------------------------------------------------------------------------------------------------

        // Sorting ArrayList

        Collections.sort(list); // -> sorting in ascending order 
        System.out.println(list);

        // converting list to array

        Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);  // it create new array


// ------------------------------------------------------------------------------------------------------

        list.remove(1); // it is removing index not value so,
        list.remove(Integer.valueOf(1));
        System.out.println(list);  // output -> [2,3]
        // Remove index
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");

        fruits.remove("Apple");
        System.out.println(fruits);

// --------------------------------------------------------------------------------------------------------------
        list.add(0,0);

        System.out.println(list);

        List<Integer> list1 = List.of(4,5,6,7,8,9);

        list.addAll(list1);
        System.out.println(list);


        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");  // asList method return fixed size list

        System.out.println(list1.getClass().getName());
        list1.set(1, "Wednesday"); // can't add but replace
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);

       List<Integer> list3 = List.of(1, 2, 3);
        */

    }
}
