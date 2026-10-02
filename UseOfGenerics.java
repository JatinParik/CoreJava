import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class UseOfGenerics {
    
    public static void main(String[] args) {
        Collection nums = new LinkedList();  //stores Object type of data (raw type)
        nums.add(5);  // Object type reference variable stores Integer type object's reference (autoboxing and Upcasting happening here)
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add("hello"); // Object type reference variable stores String type object's reference
        System.out.println(nums);
        for(Object i : nums) {  //Have to use Object here as raw collection by default stores Object type data and Integer is Object but Object is not Integer so Integer can't be used
            // int num = (Integer)i;  can be used but it will error as not all values are integer values so downcasting will not work for values other than integer type (here auto unboxing and downcasting happening together)
            System.out.print(i + " ");  //Here value will be directly printed instead of address as toString() of Integer will override toString() of Object as actual object is of Integer
        }
        // for(Object i : nums) {
        //     int num = (Integer)i;  --> the error we get here should be compile time not run time therefore we use generics
        //     System.out.println(num + " ");
        // }

        Collection<Integer> numbs = new ArrayList<>();
        numbs.add(5);
        numbs.add(4);
        numbs.add(2);
        // numbs.add("hello"); --> will give compile time error     
    }
}
