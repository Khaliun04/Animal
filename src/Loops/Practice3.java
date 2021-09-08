package Loops;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /*
        ask user to enter integer number
        find and print number which can divide that given number
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please a enter number");

        int number = input.nextInt();

        int divider = 1;

        while(divider<=number) {

            if (number % divider == 0) {
                System.out.println(divider);
            }
            divider++;
        }

    }
}
