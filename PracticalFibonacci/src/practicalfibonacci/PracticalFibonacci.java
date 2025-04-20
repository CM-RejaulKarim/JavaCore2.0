
package practicalfibonacci;

import java.util.Scanner;

public class PracticalFibonacci {

   
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a Number ");
        int inp = s.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int sum = 0;
        
        for (int i = 3; i <= inp; i++) {
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
            
        }
        
    }
    
}
