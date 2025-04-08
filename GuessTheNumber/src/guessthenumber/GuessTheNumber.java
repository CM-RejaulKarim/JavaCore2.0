package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        
//         int n2 = (int) (Math.random() * 10);
//         System.out.println(n2);
        
        Scanner s = new Scanner(System.in);

        System.out.println("Guess a Number from 0-9 ");
        int n1 = s.nextInt();

        int n2 = (int) (Math.random() * 10);

        if (n1 == n2) {
            System.out.println("You Win");
        } 
        else {
            System.out.println("You loose");
        }

    }

}
