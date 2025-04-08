package gradecalculate;

import java.util.Scanner;

public class GradeCalculate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input Mark: ");
        int mark = s.nextInt();

        if (mark < 60) {
            System.out.println(mark + " is Grade F");
        } else if (mark < 70) {
            System.out.println(mark + " is Grade D");
        } else if (mark < 80) {
            System.out.println(mark + " is Grade C");
        } else if (mark < 90) {
            System.out.println(mark + " is Grade B");
        } else if (mark <= 100) {
            System.out.println(mark + " is Grade A");
        } else {
            System.err.println(mark + " is not Valid Mark");
        }

    }

}
