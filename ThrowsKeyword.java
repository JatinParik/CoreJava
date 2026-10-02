import java.io.IOException;
import java.io.PrintStream;

@SuppressWarnings("unused")
public class ThrowsKeyword {

    static void fun() {
        throw new RuntimeException();  //Unchecked exception (not necessary to handle)
    }

    static void fun2() throws Exception {   //necessary to mentio throws (as the method is not handling a checked exception)
        throw new Exception();  //Checked exception (must be handled)
    }

    static void fun3() throws IOException{  //necessary to mention throws (as the method is not handling a checked exception)
        throw new IOException();  //Checked exception (must be handled)
    }

    static void fun4() throws Exception{   //necessary to mention throws (as the method is not handling a checked exception)
        throw new IOException();  //Checked exception (must be handled)
    }

    static void fun5() throws Exception {
    }
    public static void main(String[] args) throws Exception {  //necessary to mention throws (as main() is not handling the checked exception coming from fun3())
        // fun();
        try {
            fun4();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            fun2();
        } catch(Exception e) {
            e.printStackTrace();
        }
        fun3();
        fun5();  //needs to handled even if there is not actaul exception
    }
}
