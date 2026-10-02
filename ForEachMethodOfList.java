import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodOfList {
    
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 9, 6, 2);

        // for(int i = 0; i<nums.size(); i++) System.out.print(nums.get(i) + " ");
        // System.out.println();

        // for(int num : nums) System.out.print(num + " ");
        // System.out.println();

        Consumer<Integer> c = new Consumer<Integer>() {
            public void accept(Integer num) {
                System.out.print(num*2 + " ");
            }
        };
        nums.forEach(c);
        System.out.println();

        Consumer<Integer> con = ob -> System.out.print(ob + " ");
        nums.forEach(con);  //passes an Consumer object so that it can do whatever written inside accept() of Consumer
        System.out.println();

        nums.forEach(num -> System.out.print(num + " "));  //directly passed lambda expression
        System.out.println();
    }
}
