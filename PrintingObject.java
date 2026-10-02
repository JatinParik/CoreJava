class Laptop {
    String model;
    int price;
    public String toString() {
        // return getClass().getName(); --> returns class name as a string
        return model + ":" + price;
    }
    // String toString() {  --> not valid because it can't override the inherited toString() from Object class outside the package
    //     return "hello";
    // }
}

public class PrintingObject {
    
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "HP";
        obj1.price = 40;
        Laptop obj2 = new Laptop();
        obj2.model = "Dell";
        obj2.price = 50;
        System.out.println(obj1);  //by default calls obj.toString()
        System.out.println(obj1.toString()); //produces same output
        System.out.println(obj2);
    }
}
