package IfStatement;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {

        /*
        ask user for his/her city name
        if city name is Chicago ask what is the school name
        if the school name is "Techtorial"
        if the school name is not "Techtorial"
        if school is not "Techtorial"
        print

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your city name");
        String cityName = scanner.nextLine();

        if(cityName.equalsIgnoreCase("Chicago")){
        System.out.println("What is your school name");
        String schoolName = scanner.nextLine();

        if(schoolName.equalsIgnoreCase("Techtorial")){
            System.out.println("You're the one of hero");
        }else {
            System.out.println("Please visit Techtorial");
        }
        }else {
            System.out.println("Please visit Chicago");
        }
    }
}
