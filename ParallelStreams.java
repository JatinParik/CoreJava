import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreams {
    
    public static void main(String[] args) {
        Random ran = new Random();
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        
        for(int i = 0; i<size; i++) {
            nums.add(ran.nextInt(100));
        }

        long stTime = System.currentTimeMillis();
        int result =  nums.stream()
                        .mapToInt(num -> {
                            try {
                                Thread.sleep(1);
                            } catch(Exception e) {}
                            return num;
                        })
                        .sum();
        long endTime = System.currentTimeMillis();
        System.out.println(result);

        long stTime2 = System.currentTimeMillis();
        int sum = nums.parallelStream()
                    .mapToInt(num -> {
                            try {
                                Thread.sleep(1);
                            } catch(Exception e) {}
                            return num;
                        })
                    .sum();
        long endTime2 = System.currentTimeMillis();
        System.out.println(sum);

        System.out.println("Normal Stream time : " + (endTime-stTime));
        System.out.println("Parallel Stream time : " + (endTime2-stTime2));
    }
}
