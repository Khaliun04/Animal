package IfStatement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {

        /*
        Ask user to enter on integer value
        check and print;
        if the "number is even"
        otherwise print "odd number"
         */
        Scanner data = new Scanner(System.in);

        System.out.println("Please enter the number even or odd");
        int number = data.nextInt();

        if (number % 2 ==0){ //number /2 = 0
            System.out.println("your number is even number");
        }
        else {
            System.out.println("your number is odd number");
        }

        }
    }

