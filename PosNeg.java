package ex.pkg1;

import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number");
        int n = input.nextInt();
        if (n > 0) {
            System.out.println(n + " is a positive number");
        } else if (n == 0) {
            System.out.println(n + " is a Null");
        } else {
            System.out.println(n + " is a negative number");
        }
    }

}
