

package vowelconsonantusingswitch;

import java.util.Scanner;


public class VowelConsonantUsingSwitch {

 
    
    public static void main(String[] args) {
     
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter a Latter ");
        String inp= s.next();
        char latter = inp.toLowerCase().charAt(0);
        
        switch (latter) {
            case 'a':
                System.out.println(inp+" is Vowel");
                break;
                
            case 'e':
                System.out.println(inp+" is Vowel");
                break;
                
            case 'i':
                System.out.println(inp+" is Vowel");
                break;
                
            case 'o':
                System.out.println(inp+" is Vowel");
                break;
                
            case 'u':
                System.out.println(inp+" is Vowel");
                break;
                
            default:
                System.out.println(inp+" is Consonant");
        }
        
        
        
    }
    
}
