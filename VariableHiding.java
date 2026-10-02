class Ag {
    int x = 4;
    void show1() {
        System.out.println("X : " + x);
    }
}

class Og extends Ag {
    int x = 3;
    void show2() {
        System.out.println("X : " + x);
    }
}

public class VariableHiding {
    
    public static void main(String[] args) {
        Og obj = new Og();
        obj.show2();  //prints 3
        obj.show1();  //prints 4 as show1() calls from Ag class where show1() wants x and in Ag there is x defined so it will refer to its own field
    }
}
