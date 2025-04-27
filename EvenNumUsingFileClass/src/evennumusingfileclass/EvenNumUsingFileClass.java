package evennumusingfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenNumUsingFileClass {

    public static void main(String[] args) {

        PrintWriter pw = null;
        PrintWriter px = null;
        try {
            pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\FileClass\\evenNumber.txt");
            px = new PrintWriter("C:\\Users\\Admin\\Desktop\\FileClass\\oddNumber.txt");

            for (int i = 1; i <= 50; i++) {
                if (i % 2 == 0) {
                    pw.println("Even Numbers are: \n"+i);

                } else {
                    px.println("Odd Numbers are: \n"+i);
                }
            }
            pw.close();
            px.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EvenNumUsingFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
