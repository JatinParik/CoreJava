class A extends Object{
   public A() {
    super();  //Calls the constructor of Object class
        System.out.println("in Constructor of A");
   }
   public A(int num) {
    super();
        System.out.println("in parameterized constructor of A");
   }
   public int add(int n1, int n2) {
        return n1+n2;
   }
}

class B extends A {  //Only extends "A" not "Object" and "A" both. (Multi-level inheritance not multiple inheritance)
   public B() {
        // super();  // Calls the constructor of super class, i.e A()
        this(8); // this will call the B(int num) constructor... B(int num)--> can't be used because its for method calling
        System.out.println("In constructor of B");
    }
   public B(int num) {
        super(num);   // Calls the parameterized constructor of super class, i.e A(int num)
        System.out.println("In parameterized constructor of B");
   }
   public int add(int n1, int n2) {   // this method will overrides the add() method of class 'A'
        return n1-n2;
   }

}

public class Inheritance {

    public static void main(String[] args) {
        // ScientificCalculator obj1 = new ScientificCalculator();
        // obj1.add(2, 4);
        // obj1.sub(2, 4);
        // obj1.mul(2, 4);
        // obj1.div(2, 4);
        // obj1.power(2, 4);
        B obj = new B(4);
        int result = obj.add(9, 2);
        System.out.println(result);
    }
}