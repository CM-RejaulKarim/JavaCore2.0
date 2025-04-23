/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialusingbiginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FactorialUsingBigInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int inp = s.nextInt();
        
//        BigInteger count = new BigInteger(inp);
        BigInteger fact1 = BigInteger.ONE;
        BigInteger fact2 = BigInteger.valueOf(10);
        BigInteger fact3 =new BigInteger("10");
        
        for (int i = 1; i <= inp ; i++) {
            fact1 = fact1.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact1);
    }
    
}
