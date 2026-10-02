import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomValues {
    
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random ran = new Random();
        for(int i = 0; i<10; i++) {
            nums.add(ran.nextInt(10, 20));  //from 10 to 19 int value
        }
        for(int i = 0; i<10; i++) {
            nums.add(ran.nextInt(100));  //from 0 to 99 int value
        }
        for(int i = 0; i<10; i++) {
            nums.add(ran.nextInt());  //any random int value 
        }
        System.out.println(nums);
    }
}
