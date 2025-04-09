
package breakandcontinue;

import java.util.Scanner;

public class BreakAndContinue {

   
    public static void main(String[] args) {
       
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n1= s.nextInt();
        
        int count= 1;
        
        while (count<=n1) {            
            if (count %3 == 0 && count % 5 == 0) {
                count++;
                continue;
            }
            else{
                System.out.println(count);
                count++;
            }
        }
        
        
    }
    
}
