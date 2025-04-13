package usernameandpasswordmatchusingarray;

import java.util.Scanner;

public class UserNameAndPasswordMatchUsingArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] sysNames = {"imran", "masud", "reja", "atik", "sadiar", "parvej", "yasin"};
        int[] passwords = {123, 234, 345, 456, 567, 678, 789};

        //int uInput=0;
        for (int i = 0; i < sysNames.length; i++) {
            System.out.println("Enter UserName");
            String uName = s.next().toLowerCase();
            String name = uName;
            if (name == sysNames[i]) {
                System.out.println("Enter Password");
                int pass = s.nextInt();
                if (pass == passwords[i]) {
                    System.out.println("Welcome");
                } else {
                    System.out.println("Invalid Password");
                }
            } else {
                System.out.println("InValid userName");
            }

//        System.out.println("Enter UserName");
//            String uName = s.next().toLowerCase();
//        int i = 0;
//            
//            if (uName == sysNames[i]){
//            for (String sysName : sysNames) {
//            }
//            }
//            else{
//            
//            }


//            myName[i] = uName;
//
//            System.out.println("Enter a Mark");
//            int uMark = s.nextInt();
//            marks[i] = uMark;
        }
//        for (int i = 0; i < myName.length; i++) {
//            System.out.println("Student's Name is \"" + myName[i] + "\" and Mark is " + marks[i]);
//            //System.out.println(myName[i]+marks[i]);
//        }
    }

}
