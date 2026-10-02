class H {
    void show() {
        System.out.println("in H show");
    }
}

abstract class He {
    He() {
        System.out.println("in He Constructor");
    }
    abstract void show();
}

public class AnonymousInnerClass {
   
    public static void main(String[] args) {
        H obj = new H() {  // creates an anonymous class called as "Anonymous Inner Class" as its created it under another class i.e "AnonymousInnerClass" and it doesn't have a name that't why called anonymous. Its .class file creates after compilation as an Inner class of "AnonymousInnerClass"
            @SuppressWarnings("unused")
            int x = 3;
            void show() {
                System.out.println("in new H show");
            }
        };
        obj.show();
        // System.out.println(obj.x); --> this will not work as we created object of anonymous class which is a sub class of H and we stored the reference of its object in type H (upcasting) thats why show() overrides and obj.x gives error as x is not defined in class H
        H obj2 = new H();
        obj2.show();
        @SuppressWarnings("unused")
        He obj3 = new He() {  // here we didn't created an object of He, we created object of anonymous class and stored its reference in type He (upcasting).. as we know that we can't instantiate an abstract class
            void show() {
                System.out.println("In anonymous class");
            }
        };
        @SuppressWarnings("unused")
        He obj4 = new He() {  //He() constructor will be called as whenever a subclass object we create, constructor of both sub class and parent class is called as first line of sub class constructor contains super() which calls the constructor of the super class
            {
                System.out.println("This will execute when anonymous class loads");
            }
            void show() {
                System.out.println("in Anonymous show");
            }
        };
    }
}
