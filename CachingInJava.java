public class CachingInJava {
/* Java uses a concept of caching in wrapper classes, caching means it stores objects(within a range) once
instead of creating new objects everytime. For ex: For Integer class java caches values from -128 to 127
java only creates objects of these values once and reuse them, suppose two objects of Integer class have 100 so
there will no two different objects, instead both references will point to the same object. Therefore when we 
compare them by == we'll get true as both are pointing to same object but for value greater than 127, java
will create separate objects therefore == will give false even with same value as == compares reference which
is different for different objects. */

//Always use .equals() to compare two objects
    
    public static void main(String[] args) {
        Integer i = 127;
        Integer j = 127;

        System.out.println(i==j);  //true

        Integer a = 128;
        Integer b = 128;

        System.out.println(a==b);  //false
    }
}
