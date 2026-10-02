import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Input {
    
    public static void main(String[] args) throws Exception {
        int num = System.in.read();  //Takes Input of a single charachter and returns its ascii value
        System.out.println(num-48);

        Reader r = new InputStreamReader(System.in);  //Reader can "read"(read or write) from any resource whether its from keyboard, from a file or from a database.
        BufferedReader bf = new BufferedReader(r);  //BufferedReader passes the object of reader therefore it can be used to take input from anywhere like from keyboard, from a file or from a database.
        // Reader rr = new FileReader("text.txt"); --> to take input from a file 
        // Reader rr = new StringReader("Hello");  --> to take input from a string
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n);
        bf.close(); // BufferedReader is a resource...like its reads from a resource...so when it reads the resource gets open so its our job to close the resource to avoid any data leakage

        // Scanner sc = new Scanner(new FileReader("null"));
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
    }
}
