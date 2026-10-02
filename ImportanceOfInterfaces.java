interface Computers {
    void code();
}

class Desktop implements Computers {
    public void code() {
        System.out.println("Writing code on given Desktop...");
    }
}

class Laptops implements Computers{
    public void code() {
        System.out.println("Writing code on given Laptop...");
    }
}

class Developer {
    void devApp(Computers com) {
        com.code();
    }
}

public class ImportanceOfInterfaces {
    
    public static void main(String[] args) {
        Desktop desk = new Desktop();

        Laptops macbook = new Laptops();

        Developer jatin = new Developer();
        jatin.devApp(macbook);  //if pass object of Laptop, code() of Laptop will call
        jatin.devApp(desk);  //if pass object of Desktop, code() of Desktop will call
    }
}
