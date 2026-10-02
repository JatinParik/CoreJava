import appleproducts.*;
import appleproducts.macbooks.*;
import java.lang.System;

public class Packages {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Iphones obj = new Iphones();
        M1Chips ob = new M1Chips();
        AppleCloth ap = new AppleCloth();
        System.out.println(ap.x);
        // System.out.println(ap.y); --> can't access here
    }
}
