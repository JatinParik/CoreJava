import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 3, 9, 6, 5, 7, 1, 2);
        
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer num) {
                if(num%2==0) return true;
                else return false;
            }
        };
        // Function<Integer, String> fun = new Function<Integer, String>() {  //Function<T, V> : T -> type on which we perform operation, V -> type we returns
        //     public String apply(Integer num) {
        //         return num + "";
        //     }
        // };
        Function<Integer, Integer> fun = new Function<Integer, Integer>() {
            public Integer apply(Integer num) {
                return num*2;
            }
        };
        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            public Integer apply(Integer num1, Integer num2) {
                return num1 + num2;
            }
        };
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(p);
        Stream<Integer> s3 = s2.map(fun);
        int result = s3.reduce(0, b);  
        System.out.println(result);

        //Lazy Execution
        // int ans = nums.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0, (n1, n2) -> n1+n2);
        // System.out.println(ans);

        //Clean way to write lazy execution
        int ans = nums.stream()
                    //Stages of pipeline
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0, (n1, n2) -> n1+n2);
        System.out.println(ans);

        Stream<Integer> sortedValues = nums.stream()
                                        .filter(n -> n%2==0)
                                        .map(n -> n*2)
                                        .sorted();
        sortedValues.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> s = nums.parallelStream()  //creates multiple threads(multiple parallel pipelines) from which multiple elements can pass simultaneously
                            .filter(n -> n%2==0)
                            .map(n -> n*2);
        s.forEach(n -> System.out.print(n + " "));  //order can be random from the initial order as elements passing simultanously through the stream
    }
}
