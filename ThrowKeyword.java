class JatinException extends RuntimeException {
    JatinException(String str) {
        super(str);  //Calls the paramterized constructor of RuntimeException instead of default constructor and then the message will be stored in that feature of RuntimeException which prints message when throw keyword is used with the object
    }
}

public class ThrowKeyword {
    
    public static void main(String[] args) {
        // int result = 0;
        // if(result==0) {
        //     throw new ArithmeticException("Output will be zero");
        // }
        // ArithmeticException e = new ArithmeticException("New Exception");
        // throw e;
        JatinException j = new JatinException("My Exception");
        try {
            throw j;
        } catch(JatinException e) {
            System.out.println(e.getMessage());
        }
    }
}
