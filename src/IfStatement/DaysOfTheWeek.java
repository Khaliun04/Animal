package IfStatement;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {

        /*
        ask user to provide to number between 1 to 7;
        if user enter 1 --> print "Monday";
        if user enter 2 --> print "Tuesday";
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number 1 to 7 ");

        int number = input.nextInt();

        if(number == 1){
            System.out.println("it is Monday");
        }
        if(number == 2){
            System.out.println("it is Tuesday");
        }
        if(number == 3){
            System.out.println("it is Wednesday");
        }
        if(number == 4){
            System.out.println("it is Thursday");
        }
        if(number == 5){
            System.out.println("it is Friday");
        }
        if(number == 6){
            System.out.println("it is Saturday");
        }
        if(number == 7){
            System.out.println("it is Sunday");
        }
        // if user give to wrong value it is nothing happened
    }
}
