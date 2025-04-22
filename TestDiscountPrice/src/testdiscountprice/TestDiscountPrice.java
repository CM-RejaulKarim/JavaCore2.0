
package testdiscountprice;

import java.util.Scanner;


public class TestDiscountPrice {

    
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Price...");
        double price = s.nextDouble();
        
        double discount = (price*0.05);
        
        if (price > 200) {
            System.out.println("Your Discount is: "+discount+"\n and Actual Price: "+(price- discount));
        } else {
            System.out.println("Price: "+ price);
        }
    }
    
}
