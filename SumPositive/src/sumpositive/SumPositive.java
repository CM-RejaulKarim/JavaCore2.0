
package sumpositive;

import java.util.Scanner;


public class SumPositive {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int uInp =  s.nextInt();
       
       int sum = 0;
       
        while (uInp > 0) {            
            sum += uInp;
        }
        System.out.println(sum);
    }
    
}
