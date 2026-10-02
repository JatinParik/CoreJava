import java.util.ArrayList;

// class var {   --> not allowed (as the objects of this class will be then of var type so it will create an ambiguity between the var keyword and class type)
// }

class Humba {

}

public class LVTI {  //Local Variable Type Inference
    
    // var a = 4; --> not allowed
    public static void main(String[] args) {
        int x = 5;
        var y = 9;
        int p;
        // var q; --> can declare variable with var keyword as the type is decided at the compilation stage so it should have some value so that compiler can decide the type
        // ArrayList<Integer> nums = new ArrayList<>();
        var nums = new ArrayList<>(); // --> var is helpful if we have large ClassNames
        nums.add(5);

        int[] arr = new int[5];
        var brr = new int[9];
        // var[] crr = new int[4]; --> not allowed as the RHS clears that its an array

        Humba hum = new Humba();
        var humb = new Humba();
    }
}
