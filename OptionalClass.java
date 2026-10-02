import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shruti", "Jatin", "Manan", "Srishti");
        String name = names.stream()
                        .filter(str -> str.contains("Sh"))
                        .findFirst()
                        .orElse("No name starts with Sh");
        System.out.println(name);

        Optional<String> selectedName = names.stream()
                                .filter(str -> {
                                    System.out.println(str + " from filter");  //proves that first pipeline is created then elements are flowing one by one
                                    return str.contains("Sh");
                                })
                                .findFirst();
        System.out.println(selectedName.orElse("No name starts with Sh"));
    }
}
