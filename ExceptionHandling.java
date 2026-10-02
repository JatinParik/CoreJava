class LL {
    int val;
    LL next;
    LL(int val) {
        this.val = val;
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;  //Normal Statement
        int j = 6;
        try {
            System.out.println("In try...");  //this will execute as till here there is no exception
            LL obj = new LL(4);
            System.out.println(obj.next.val);  //throws an NullPointerException object
            j = j/i; //Critical Statement --> throws an ArithmeticException object
        } catch(ArithmeticException e) {  //--> catches the object, now its on us what we want to do with the object
            System.out.print("Something is wrong : ");
            System.out.println(e.getMessage()); //prints the exception message
        } catch(NullPointerException e) {
            System.out.print("Something is wrong : ");
            System.out.println(e.getMessage());
        }
        System.out.println(j);

        int x = 0;
        int y = 8;
        try {
            y /= x;
            System.out.println("This will not execute if exception occurs");
        } catch(Exception e) {  //catches every exception as every other exception class extends "Exception" class
            //Ignores the exception as catch block is empty
            // throw e; --> again throws the exception
        }
        System.out.println("x : " + x + ", y : " + y);

        int p = 2;
        @SuppressWarnings("unused")
        int q = 9;
        String str = "null";
        int[] arr = new int[3];
        try {
            q /= p;
            System.out.println(str.length());
            System.out.println(arr[4]);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Given array index is out of range");
        } catch(Exception e) {   //to avoid unexpected exception 
            System.out.println("Something went wrong : " + e);
        }

        // try {
        //     q /= p;
        //     System.out.println(str.length());
        //     System.out.println(arr[4]);
        // } catch(Exception e) {
        //     System.out.println("Exception occur : " + e.getMessage());
        // } catch(ArithmeticException e) {   --> gives error as the catch(Exception e) can handle all type of exception therefore this catch block will redundant, it will never execute, its an unreachable code
        //     System.out.println("Arithmetic exception occured");
        // }
        System.out.println("End");
    }
}
