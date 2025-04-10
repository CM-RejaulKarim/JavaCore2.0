package jhankar;

import java.util.Scanner;

public class TemporaryTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

    }

    public static long doContinue(int input) {
        int count = 1;
        
        
        while (count <= input) {
            if (count>=input) {
                count++;
                break;
            } else {
                System.out.println(count);
                count++;
            }
        }
    }

}
