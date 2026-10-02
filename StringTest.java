class Human {
    String name;
    String surname = "Pareek";
}

public class StringTest {
    
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Jatin Pareek");
        // str1.append("Jatin Pareek");
        System.out.println(str1.capacity());
        StringBuilder str2 = new StringBuilder("Jatin Pareek");
        System.out.println(str2.capacity());
        Human obj = new Human();
        System.out.println(obj.name + obj.surname);
    }
}
