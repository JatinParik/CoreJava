// @FunctionalInterface  --> this will give error because the public class name is also same as "FunctionalInterface" therefore it will consider the class that we defined instead of the inbuild annotation
@java.lang.FunctionalInterface  // --> this makes sure that the interface is functional 
interface Lambda {
    void show();
}

@java.lang.FunctionalInterface
interface Gamma {
    void show(int i);
}

@java.lang.FunctionalInterface
interface Alpha {
    void show(int age, String name);
}

@java.lang.FunctionalInterface
interface Beta {
    int add(int i, int j);
}

public class FunctionalInterface {
    
    public static void main(String[] args) {
        //Lambda Expressions 
        // -> called lambda
        
        Lambda l = () ->
                System.out.println("In Lambda Show");
        l.show();

        Gamma g = i ->  System.out.println("In Gamma Show : " + i);
        g.show(4);

        Alpha a = (age, name) -> {
                    System.out.println(name + " : " + age);
        };
        a.show(20, "Jatin Pareek");

        Alpha al = (int age, String name) ->  System.out.println("Name : " + name + " , Age : " + age);
        al.show(23, "Mridul Raj");

        Beta b = (i, j) -> 
        {
            return i+j;
        };
        int result = b.add(13, 7);
        System.out.println(result);

        // Beta be = (i, j) -> return i+j; --> can't use return statement without {} as its a statement not an expression... An expression can be used without {}
        Beta be = (i, j) -> {return i+j;};  //valid 
        int ans = be.add(6, 4);
        System.out.println(ans);

        //To use return statement without {} we can just write the value to return as its obivious that that value will be returned as there is no {}, in that case we can make it a expression and use it without {}
        Beta bet = (i, j) -> i+j;
        int val = bet.add(3, 9);
        System.out.println(val);
    }

}
