import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return name + " : " + age;
    }
    public int compareTo(Student that) {
        return this.age>that.age ? 1 : -1;
    }
}

public class Sorting {
    
    public static void main(String[] args) {  
        List<Integer> l = new ArrayList<>();
        l.add(31);
        l.add(45);
        l.add(23);
        l.add(12);
        l.add(94);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                if(x%10 > y%10) return 1;
                else return -1;
            }
        };
        Collections.sort(l, com);  //Sorting on the basis of last digit
        System.out.println(l);

        Comparator<String> c = (s1, s2) -> s1.length()-s2.length();

        List<String> names = new ArrayList<>();
        names.add("Jatin");
        names.add("Shreyam");
        names.add("Manan");
        names.add("Gurdeep");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names, c);
        System.out.println(names);

        List<Student> students = new ArrayList<>();
        students.add(new Student(20, "Jatin"));
        students.add(new Student(28, "Raj"));
        students.add(new Student(23, "Shrishti"));
        students.add(new Student(21, "Manan"));
        System.out.println(students);

        // Comparator<Student> sortAges = (s1, s2) -> s1.age>s2.age ? 1 : -1;

        // Collections.sort(students, sortAges);
        // Collections.sort(students); --> this will not work(if Student doesn't implements Comparable<K>) as the logic to sort students is not defined 
        Collections.sort(students);
        System.out.println(students);
    }
}
