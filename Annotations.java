class O {
    void callTheMethodWhichBelongsToThisClass() {
        System.out.println("Hey, Hello");
    }
}

// @Deprecated  --> to specify its deprecated or its going to remove or we found something better
class F extends O {
    @Override
    void callTheMethodWhichBelongsToThisClass() {
        System.out.println("Hey, How are You?");
    }
}

public class Annotations {
    
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        O oo = new O();
        F obj = new F();
        obj.callTheMethodWhichBelongsToThisClass();
    }
}
