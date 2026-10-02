// class Employee {  //class just to store data, data should be immutable so that it can't be modified

//     private final int id;
//     private final String name;

//     public Employee(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public String toString() {
//         return name + " : " + id;
//     }

//     public boolean equals(Employee that) {
//         if(this.id == that.id && this.name == that.name) return true;
//         return false;
//     }
// }

//record can implement interfaces but can't extend any other class as it by default extends Record class
record Employee(int id, String name) implements Cloneable {  //instance variables in a record are called components or state variables or state description

    static int x;
    // int y; --> instance variables must be declared in the declaration of record, can't declare inside it

    public Employee() {  // --> non-canonical constructor
        this(0, "");  // --> have to assign some value to our components as they are final and dont have any default values but its not recommended to create default constructors as the values we set here can't be modified
    }

    //we don't have to manually create this canonical constructor as its by-default there, but to add some extra feature to it, we have to create it
    // public Employee(int id, String name) {  --> canonical constructor(sets all the component values of record)
    //     this.id = id;
    //     this.name = name;
    // }

    public Employee {  // --> compact canonical constructor (don't have to use parantheses() as the parantheses after ClassName in declration of record have the components and they will get set by-default)
        if(id<=0) throw new IllegalArgumentException("ID must be greater than 0");
    }
}

public class RecordClass {
    
    public static void main(String[] args) {
        Employee e1 = new Employee(2, "Shreyam");
        Employee e2 = new Employee(1, "Himansh");
        Employee e3 = new Employee();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(e1.equals(e2));
        System.out.println(e1.name());
        System.out.println(e1.id());
        System.out.println(e2.name());
        System.out.println(e2.id());
    }
}