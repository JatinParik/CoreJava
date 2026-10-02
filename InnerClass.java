class Ao {
    int x = 2;

    class Bo {
        int y = 4+x;  // x can be used in class Bo due to its scope but we can't access it with the object of Bo as its not the part of it
    }

    static class Co {
        int z = 3;
    }
}

public class InnerClass {
    
    public static void main(String[] args) {
        Ao obj = new Ao();
        System.out.println(obj.x);
        Ao.Bo obj2 = obj.new Bo();
        System.out.println(obj2.y);
        // System.out.println(obj2.x);  --> invalid, as there is no 'x' variable in class Bo
        Ao.Co obj3 = new Ao.Co();
        System.out.println(obj3.z);
    }
}
