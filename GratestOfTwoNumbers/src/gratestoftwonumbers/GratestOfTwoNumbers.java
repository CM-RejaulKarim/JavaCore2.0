package gratestoftwonumbers;

import java.util.Scanner;

public class GratestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1St Number ");
        int n1= s.nextInt();
        
        System.out.println("Enter 2nd Number ");
        int n2 = s.nextInt();
        
        if (n1>n2) {
            System.out.println(n1+" is Largest of Two");
        }
        else{
        System.out.println(n2+" is Largest of Two");
        }
        
        
    }
}
