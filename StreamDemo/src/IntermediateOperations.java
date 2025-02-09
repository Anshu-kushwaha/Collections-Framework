import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked

        // 1. Filter

        List<String> list = Arrays.asList("Anshu", "Mohit", "Raj");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // no filtering at this point
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        // 2. map
        Stream<String> stringStream = list.stream().map(String::toString);

        // 3. Sorted  --> in natural ordering
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4. Distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        // 5. Limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // 6. Skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100));

        // 7. peek
        // perform an action on each element as it is consumed
        Stream.iterate(1, x -> x +1).skip(10).limit(100).peek(System.out::println).count();

        //8. flatmap
        // Handle streams of collections, lists, or arrays where each element is itself a collection
        // Flatten nested structures (e.g.,lists within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time.

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("APPLE", "BANANA"),
                Arrays.asList("MANGO", "KIWI"),
                Arrays.asList("PEAR", "PINEAPPLE")
        );
        System.out.println(listOfLists.get(1).get(1));

        // in lowercase and in one line sequence
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toLowerCase).toList());

        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatmap is useful"
        );
        // return in one list and upperCase
        System.out.println(sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase).toList());
    }
}
