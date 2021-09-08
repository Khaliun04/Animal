package IfStatement;

import java.util.Scanner;

public class DaysOfTheWeek2 {
    public static void main(String[] args) {

        /*
        ask user first letter of the
        if user give 'M' --> print "Monday"
                     'T' --> print "Tuesday or Thursday"
                     'S' --> print "Saturday or Sunday
                       */

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter first letter of the days");

        String letter = scanner.nextLine();

        if(letter.equalsIgnoreCase("M")){
            System.out.println("it is Monday");
        }
        if(letter.equalsIgnoreCase("t")){
            System.out.println("it is Tuesday or Thursday");
        }
        if(letter.equalsIgnoreCase("W")){
            System.out.println("it is Wednesday");
        }
        if(letter.equalsIgnoreCase("f")){
            System.out.println("it is Friday");
        }
        if(letter.equalsIgnoreCase("s")){
            System.out.println("it is Saturday or Sunday");
        }
        // if user give wrong value your code running but nothing to show

        else {
            System.out.println("Your entry is not valid, there is no day starting with that char");
        }
    }
}
