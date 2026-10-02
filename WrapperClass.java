public class WrapperClass {
    
    public static void main(String[] args) {
        @SuppressWarnings("removal")
        Integer i = new Integer(5); //Boxing
        Integer j = Integer.valueOf(7);  //Boxing
        Integer k = 9;  //Auto-Boxing
        int n1 = i.intValue();  //Unboxing
        int n2 = j;  //Auto-Unboxing
        String str = "13";
        int n3 = Integer.parseInt(str);
        // String str2 = "Hello";
        // int num = Integer.parseInt(str2); --> Not valid as str2 doesn't contains an integer value as a string
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
