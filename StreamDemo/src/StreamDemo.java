import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
         /* feature introduction in java 8
         -> process collections of a data in a functional and declarative manner
         -> simplify data processing
         -> embrace functional programming
         -> improve readability and maintainability
         -> enable easy parallelism

            What is stream ?
         -> A sequence of elements supporting functional and declarative programing

            How to use Streams ?
         -> Source, intermediate operations & terminal operations

          */

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
        int count = 0;   // to count even numbers
        for ( int i : number){
            if ( i % 2 == 0 ) {
                count++;
            }
        }
        System.out.println(count);

        // And by using STREAM
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        // no need to write loops if else blah blah......


        // Creating Stream
        // 1. From collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        // 2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of
        Stream<String> stream2 = Stream.of("a", "b");
        // Infinite streams
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream.iterate(1, x -> x + 1).limit(100);




    }
}