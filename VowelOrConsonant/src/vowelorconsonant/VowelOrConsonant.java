package vowelorconsonant;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//      1st Attempt
//        System.out.println("Enter a Latter ");
//        String uInp = sc.next();
//        String str = uInp.toLowerCase();
//        char latter = str.charAt(0);
//
//        if (latter == 'a' || latter == 'e' || latter == 'i' || latter == 'o' || latter == 'u') {
//            System.out.println(uInp + " is Vowel");
//        }
//        else if(latter>='a'&& latter<='z'){
//         System.out.println(uInp+" is Consonant");
//        }
//        else{
//         System.err.println(uInp+" is not a Latter");
//        }
        System.out.println("Enter a Latter ");
        String uInp = sc.next();

        if (uInp.equalsIgnoreCase("a")
                || uInp.equalsIgnoreCase("e")
                || uInp.equalsIgnoreCase("i")
                || uInp.equalsIgnoreCase("o")
                || uInp.equalsIgnoreCase("u")) {
            
            System.out.println(uInp + " is Vowel");
        } 
        else {
            System.err.println(uInp + " is Consonant");
        }

    }

}
