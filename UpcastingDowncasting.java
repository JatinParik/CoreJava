class P {
    void show1() {
        System.out.println("In Parent Class");
    }
    void see() {
        System.out.println("Class P");
    }
}

class C extends P {
    void show2() {
        System.out.println("In Child Class");
    }
    void see() {
        System.out.println("Class C");
    }
}

public class UpcastingDowncasting {

    public static void main(String[] args) {
        P obj = new C();  //Reference of object of Child class is stored in reference variable of Parent class. obj is of P data type and we stored C datatype data in it. Therefore it type casted implicitly C datatype to P datatype. This is called Upcasting. Now this object will refer to P only, means it still has all the properties of C but we can't access them through obj as it is of P datatype and now through obj we can only access properties of P.
        obj.show1();
        // obj.show2(); --> this will give error
        C obj2 = (C)obj;  // Downcasting... have to do it explicitly... now obj2 can access the properties of C as well as P 
        obj2.show1();
        obj2.show2();
        C ob = (C)new P();  //--> invalid...as object is created of P class and it can't have properties and features of class C or it can't refer C
        ob.show1();
        // ob.show2();
        P oob = new C();  //oob is refering to P but the object is of C and the reference variable oob calls the methods through the actual object that is of C it doesn't calls the methods through the class P
        oob.see(); //Method of Class C will be called as the actual object is of class C
    }
}