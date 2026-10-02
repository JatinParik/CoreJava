class Cars {
    String brand;
    String fuelType;
    int exhausts;
}

public class Array {

    public static void main(String[] args) {
        Cars verna = new Cars();
        verna.brand = "Hyundai";
        verna.fuelType = "Petrol";
        verna.exhausts = 2;

        Cars safari = new Cars();
        safari.brand = "Tata";
        safari.fuelType = "Diesel";
        safari.exhausts = 1;

        Cars chiron = new Cars();
        chiron.brand = "Bugatti";
        chiron.fuelType = "Hydrogen";
        chiron.exhausts = 4;

        Cars[] carr = new Cars[3];
        carr[0] = verna;
        carr[1] = safari;
        carr[2] = chiron;

        // for(Cars c : carr) {
        //     System.out.println("Car Brand : " + c.brand);
        //     System.out.println("   Fuel Type : " + c.fuelType);
        //     System.out.println("   Number of exhausts : " + c.exhausts);
        // }

        String name = new String("Jatin");
        String surname = "Pareek"; // Automatically creates an object in heap with value "Pareek"
        // name = "Jatin Pareek";
        System.out.println(name + " " + surname);
    }
}