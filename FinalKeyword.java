class Android {
    final int androidNumber = 7;
    final int specialNumber() {
        return 7;
    }
}

class Realme extends Android {
    // int specialNumber() {     --> can't be done because we can't override final methods
    //     return 6;
    // }
}

final class SecretClass {
    //Top Secret
}

// class Chomu extends SecretClass {    --> can't inherit a final class

// }

public class FinalKeyword {
    
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println(PI);
        // PI = 3.12;  --> final variable can't be modified
    }
}
