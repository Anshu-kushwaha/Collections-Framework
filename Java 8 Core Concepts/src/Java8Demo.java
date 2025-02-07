import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        // Streams

        // Java 8 --> minimal code, functional programing
        // Java 8 --> lambda expression, Streams, Date & Time API

        // lambda expression
        // lambda expression is an anonymous function ( no name, no return type, no access modifier )

        Thread t1 = new Thread(()-> {
            System.out.println("Hello");   // no need to implement and make class like below
        });

                // Lambda Expressions
        // Functional interface's reference can hold lambda expression
        MathOperation sumOperation = (a, b) -> a + b;          // you may remove return and also curly braces
        MathOperation subtractOperation = (a, b) -> a - b;
        int res = sumOperation.operate(3, 6);
        System.out.println(res);


        // Predicate --> Functional interface (Boolean value function )
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(6));  // return true or false

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithU = x -> x.toLowerCase().endsWith("u");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithU);
        System.out.println(and.test("Anshu"));

        // so with lambda expression no need to write any methods
        // if you want to check something always use Predicate -> it only holds a condition

        // Function --> work for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(30));
        System.out.println(doubleIt.apply(50));

        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);  // same result
        System.out.println(res2);

        // Consumer - consume  --> there's no return type
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(69);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for ( int i: x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        //Supplier   --> only supply
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        // Combined Example

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consume = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consume.accept(function.apply(supplier.get()));
        }

        // BiPredicate, BiConsumer, BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2== 0;
        System.out.println(isSumEven.test(5, 5));

        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("an", "shu"));

        // Function<Integer, Integer> a = x -> 2 * x;  // we can write unaryOperator to perform two Integer in one
        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;  // to return sum of two numbers

        // Mrthod referance --> use method without invoking & in place of lambda expression
        List<String> student = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        student.forEach(x -> System.out.println(x));  // by lambda expresssion
        student.forEach(System.out::println);  // by method reference ::  --> easier than lambda expression

        // Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhonelist = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).toList();  // method reference
        // MobilePhone::new ---> constructor
    }
}

class MobilePhone{
    public MobilePhone(String name) {
        this.name = name;
    }

    String name;
}

/* class SumOperation implements MathOperation{

    @Override
    public int operate(int a, int b) {   --> no need
        return a + b;
    }
}

 */
@FunctionalInterface
interface MathOperation {
    int operate (int a, int b);
}