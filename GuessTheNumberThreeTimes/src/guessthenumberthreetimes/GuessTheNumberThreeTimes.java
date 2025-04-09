
package guessthenumberthreetimes;

import java.util.Scanner;


public class GuessTheNumberThreeTimes {

    
    public static void main(String[] args) {
       int rand=(int) (Math.random()*10);
        System.out.println(rand);
        
        Scanner s=new Scanner(System.in);
        
        
        
        System.out.println("Guess a Number: ");
        int inp= s.nextInt();
        
        int count=1;
        boolean totalTry= false;
        
        while (count<3 ) {
            if (inp == rand) {
                System.out.println("you Win.");
                totalTry= true;
                break;
            }
            else if(inp < rand){
                System.out.println("You Guess Lower Number.");
                System.out.println("Enter a New Guess");
                inp =s.nextInt();
            }
            else if(inp > rand){
             System.out.println("You Guess Higher Number.");
                System.out.println("Enter a New Guess");
                inp =s.nextInt();
            }
            
            if(!totalTry){
                System.err.println("Wrong Guess, TRy Again");
                System.out.println("Good Luck");
            }
            count++;
           
        }
        
         s.close();
        
    }
    
}
