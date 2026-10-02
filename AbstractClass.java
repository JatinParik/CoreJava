abstract class Car {  //abstract class can't be instantiated means we can't create its object

    // void drive();  --> declaring a method can't be done without abstract keyword
    // abstract void drive();  --> a method can be declared using abstract keyword but only if the class is also abstract
    abstract void drive();
    // abstract void cool();
    void playMusic() {  //concrete method
        System.out.println("Music Playing...");
    }
    abstract void jump();
}

abstract class Swift extends Car {  // abstract class 
    void drive() {  // it may not be implemented here as it is itself an abstract class
        System.out.println("Driving...");
    }
    abstract void fly();
}

class NewSwift extends Swift {   // concrete class
    void fly() {  //--> must be implemented as its an abstract method of its parent class 
        System.out.println("Flying...");
    }
    void jump() {
        System.out.println("Jumping..."); //must be implemented as if not implemented then how can the method fly() be called as its only declared in the Car class and the parent of current class also not implemented the method fly()
    }
}



public class AbstractClass {
    
    public static void main(String[] args) {
        Swift c = new NewSwift();
        c.drive();
        c.playMusic();
        c.jump();
    }
}
