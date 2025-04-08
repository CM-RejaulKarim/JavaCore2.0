package radiuscalculationusingprompt;

import java.util.Scanner;

public class RadiusCalculationUsingPrompt {

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//
//        System.out.println("enter radius ");
//        double radiusVal = s.nextDouble();
//        if (radiusVal < 1) {
//            System.out.println("Enter Valid value ");
//            float secondAttmt = s.nextFloat();
//            
//            double calculation = Math.PI*Math.pow(secondAttmt, 2);
//            System.out.println(calculation);
//        }
//        else{
//        double result =  Math.PI*Math.pow(radiusVal, 2);
//        System.out.println(result);
//        }
        Scanner s = new Scanner(System.in);
        double areaOfCircle;

        System.out.println("enter radius ");
        double radius = s.nextDouble();

//        if (radius < 1) {
//        System.out.println("Enter Valid Value ");
//            radius = s.nextDouble();

//            areaOfCircle = Math.PI * Math.pow(radius, 2);
//
//        } else {
//            
//            areaOfCircle = Math.PI * Math.pow(radius, 2);
//        }
        if (radius > 1) {
            areaOfCircle = Math.PI * Math.pow(radius, 2);

        } else {
            System.out.println("Enter Valid Value ");
            radius = s.nextDouble();

            areaOfCircle = Math.PI * Math.pow(radius, 2);
        }
        System.out.println(areaOfCircle);
    }
}
