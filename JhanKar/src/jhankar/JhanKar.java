
package jhankar;

import java.util.Scanner;

public class JhanKar {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.err.println("Enter a Year ");
        int year = s.nextInt();
        
        System.err.println("Enter a month ");
        String month =s.next();
        
        System.err.println("Enter Date ");
        String date = s.next();
        
        System.out.println("Output: "+month +" "+ date+", "+year);
        
        
    //    System.out.println(message.concat(" Programmer"));
      
        //      System.out.println("sub string "+message.substring(2));
    }

}
