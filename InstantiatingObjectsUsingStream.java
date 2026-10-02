import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int rollNo;

    Student() {

    }
    Student(String name) {
        this.name = name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setRoll(int rollNo) {
        this.rollNo = rollNo;
    }
    int getRoll() {
        return rollNo;
    }
    public String toString() {
        return name + " : " + rollNo;
    }
}

public class InstantiatingObjectsUsingStream {
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jatin", "Rahul", "Harsh");
        List<Student> students = new ArrayList<>();
    
        for(String name : names) {
            students.add(new Student(name));
        }
        System.out.println(students);

        students = names.stream()
                    .map(name -> new Student(name))
                    .toList();
    }
}
