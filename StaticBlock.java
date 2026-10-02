class Mobiles {
    static String phoneType;
    static {    //executes whenever this class loads (class loads only once therefore it executes only once)
        System.out.println("Hello I am in a static block");
        phoneType = "SmartPhone";
    }
    void callMe() {
        System.out.println("Hey, there is a non-static method.");
    }
    Mobiles() {
        System.out.println("An object is created");
    }
}

public class StaticBlock {
    
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobiles");
        new Mobiles().callMe();
    }
}
