package usernameandpasswordmatchusingarray;

import java.util.Scanner;

public class UserNameAndPasswordMatchUsingArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter UserName");
        String uName = s.next();

        String[] sysNames = {"imran", "masud", "reja", "atik", "sadiar", "parvej", "yasin"};
        int[] passwords = {123, 234, 345, 456, 567, 678, 789};
        
        for (int i = 0; i < sysNames.length; i++) {

            

            if (!uName.equalsIgnoreCase(sysNames[i])) {
                System.out.println("InValid userName");
            } else {
                int index = i;

                System.out.println("Enter Password");
                int pass = s.nextInt();

                if (pass.equals(passwords[index])) {
                    System.out.println("Welcome");
                } else {
                    System.out.println("Invalid Password");
                }
            }
            break;
       
        }

    }

}
