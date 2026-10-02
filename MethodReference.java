import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class Students {
    private String name;
    private int age;

    public Students(String name) {
        this.name = name;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }
}
public class MethodReference {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jatin", "Rohan", "Raj");
        System.out.println(names);

        List<String> uNames = names.stream()
                                .map(name -> name.toUpperCase())
                                .toList();
        System.out.println(uNames); 

        List<String> upNames = names.stream()
                                .map(String :: toUpperCase)  //call toUpperCase for every element flowing in stream, we just have to mention that where that method belongs when we are calling for all elements
                                .toList();
        System.out.println(upNames);

        List<Integer> nums = Arrays.asList(-2, 4, -7, -9, 5);

        // Function<Integer, Integer> f = num -> Math.abs(num);
        Function<Integer, Integer> f = Math::abs;  //Class static method reference

        // Consumer<Integer> c = num -> System.out.println(num);
        Consumer<Integer> c = System.out :: println;  //Object instance method reference
        nums.stream()
        .map(f)
        .forEach(c);

        List<String> upperNames = names.stream()
                                    .map(String :: toUpperCase) //Class instance method reference
                                    .toList();
        System.out.println(upperNames);

        List<Students> studs = names.stream()
                                .map(Students :: new)  //Constructor reference --> .map(name -> new Student(name))
                                .toList();
        System.out.println(studs);
    }
}