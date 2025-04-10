
package learnmethod;

import java.util.Scanner;


public class LearnMethod {

   
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter 1st no");
        int n1= s.nextInt();
        
        System.out.println("Enter 2nd no");
        float n2= s.nextFloat();
        
        float result = doSum(n1, n2);
        
        System.out.println(result);
                
        //System.out.println(doSum(12, 20));
        //System.out.println((int)doSum(12, 20.6f));
    }
    
    public static float doSum(int num1, float num2){
        float result = num1+ num2;
        
        return result;
    }
    
}
