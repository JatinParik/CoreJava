import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyKeyword {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        try { 
            throw new RuntimeException();
        } catch(Exception e) {
            System.out.println("Yo");
        } finally {
            System.out.println("I am here");           
        }
        System.out.println("Bye");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = null;
        try {
            br = new BufferedReader(in);
            @SuppressWarnings("unused")
            int n = Integer.parseInt(br.readLine());  //br.readLine() throws NumberFormatException and IOException
        }
        catch(IOException e) {
            System.out.println("Something went wrong..");
        } finally {  
            br.close();  //resource will be closed even if the exception is handled or not
        }

        //In later version of java we can create try with resources to auto close the resource
        try (BufferedReader bf = new BufferedReader(in)) {  //bf will be automatically closed after try block execution
            @SuppressWarnings("unused")
            String s = bf.readLine();
        }  

        // try {
        //     throw new NullPointerException();
        // } finally {
        //     System.out.println("No code will execute after this");
        // }
        // System.out.println("Unreachable code"); --> unreachable code as the exception is not handled so the last code to execute is the finally block.
    }
}