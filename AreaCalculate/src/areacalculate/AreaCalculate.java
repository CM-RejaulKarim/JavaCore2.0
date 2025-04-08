
package areacalculate;

import java.util.Scanner;


public class AreaCalculate {


    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("enter radous");
     //   int inp= scanner.nextInt();
 /*
        final float PI=3.1416f;
        //float area = inp*inp;
        float result =PI* (inp*inp);
        System.out.println(result);
       // System.out.println(3.1416*area);
*/
        int radius= scanner.nextInt();
        
        double result = Math.PI*Math.pow(radius, 2);
        System.out.println(result);
    }
    
}
