interface Li {
    int num = 4; // must have to initialize the value...can't leave final field blank in classes as they have some default values but using final keyword makes it necessary to initialize them with some value.... unlike methods we can't just declare a variable and assign value to it later or change its value
    // int x;  
    // x = 3;  --> not possible in any class 
    String name = "Jatin Pareek";  //By default --> final static String name = "Jatin Pareek";
    default void show() {
        System.out.println("In show");
    }
    void config();  // --> public abstract void config();
    public void config2(); // --> public abstract void config2();
}

class Be implements Li {
    public void config() {
        System.out.println("in Config");
    }
    public void config2() {
        System.out.println("in Config2");
    }
}

interface X {
    void show();
}

interface Y extends X {
    void run();
}

@SuppressWarnings("unused")
class Hi implements X, Y, Li {
    public void show() {
        System.out.println("Showing...");
    }
    public void run() {
        System.out.println("Running...");
    }
    public void config() {
        System.out.println("in config");
    }
    public void config2() {
        System.out.println("in config2");
    }
}

public class Interfaces {
    
    public static void main(String[] args) {
        Li oo = new Be();
        oo.show();
        oo.config();
        oo.config2();
        System.out.println(Li.name);
        System.out.println(Li.num);
        Be obj = new Be();
        obj.config();
        obj.config2();
        Hi ob = new Hi();
        ob.config();
        ob.config2();
        ob.show();
        ob.run();
        X in = new X() {
            public void show() {
                System.out.println("In Anonymous Show");
            }
        };
        in.show();
    }
}
