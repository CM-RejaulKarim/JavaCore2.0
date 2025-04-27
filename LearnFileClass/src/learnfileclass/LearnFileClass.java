package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Admin\\Desktop\\FileClass\\FileClass.txt");

        System.out.println(f.exists());

        Scanner s = new Scanner(System.in);
        PrintWriter pw = null;

        System.out.println("Enter limit...");
        int size = s.nextInt();

        try {
            for (int i = 1; i <= size; i++) {
                System.out.println("\n Enter Your Subject...");
                String sub = s.next();
                pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\FileClass\\" + sub + ".txt");

                pw.println("Hello World.");
                pw.println("Hello Java.");
                pw.println("Hello FileClass.");

                System.out.println("Enter Details");
                s.nextLine();
                String descr = s.nextLine();
                pw.print(descr);

//                s.close();
                pw.close();
            }

//            pw = new PrintWriter(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
