enum Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

interface Jatin {

}

enum Status implements Jatin{
    Pending, Ongoing, Success, Failed;
}

enum LAptop {
    MACBOOK(2000, "Apple"), XPS(2200, "Dell"), YOGABOOK(1800, "Lenovo"), CHROMEBOOK(800, "Asus"), ALIENWARE;
    int price;
    int showPrice() {
        return price;
    }
    private String company;
    private LAptop(int price, String company) {  //making a constructor private means that we can create the object within the class only
        System.out.println(this.name() + " called the parameterized constructor");
        this.price = price;
        this.company = company;
    }
    String getCompany() {  
        return company;
    }
    private LAptop() {
        System.out.println(this.name() + " called the default constructor");
    }
    
}

public class Enumeration {
    
    public static void main(String[] args) {
        Days d = Days.Thursday;
        d = Days.Friday;
        System.out.println(d.ordinal());
        System.out.println(d.getClass().getSuperclass());
        if(d == Days.Friday) {
            System.out.println("its fridayyyy");
        } 
        if(d.equals(Days.Friday)) System.out.println("its fridayyy");
        Days[] dd = Days.values();
        for(Days o : dd) {
            System.out.print(o + " ");
        }
        System.out.println();
        for(int i = 0; i<7; i++) {
            System.out.print(dd[i] + " ");
        }
        System.out.println();
        Status s = Status.Pending;
        switch(s) {
            case Success : {
                System.out.println("Done");
                break;
            }
            case Failed : System.out.println("Try Again");
            break;
            case Ongoing : 
                System.out.println("Running");
                break;
            default : System.out.println("Request Pending");
        }
        LAptop lap = LAptop.MACBOOK;
        System.out.println(lap.price);
        System.out.println(lap.showPrice());
        System.out.println(lap.getCompany());
    }
}
