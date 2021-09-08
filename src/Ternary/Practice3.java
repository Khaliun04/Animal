package Ternary;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /*
        ask user for their last name
        if the last name start with 'A' to 'K'
        concat the last name with "most popular last name

        otherwise;
        concact the last name with: "well know last name"
        print out the result
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your last name");

        String lastName = scanner.nextLine().toUpperCase();

        String result =lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'K'    ?
              //  lastNameLetter.concat("most popular last name")  :    lastNameLetter.concat("well know last name");
              lastName + "most popular last name"  :  lastName + "well know last name";
        System.out.println(result);


    }
}
