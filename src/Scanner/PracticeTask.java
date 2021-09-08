package Scanner;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {

        /*
        ask user to provide their height and weight and calculate their BMI
        Formula --> BMI = weight / height * height
         */
        Scanner kg = new Scanner(System.in);
        System.out.println("Please enter your height in kg ? ");
        double height=kg.nextDouble();
        System.out.println("Please enter your weight in meter? ");
        double weight = kg.nextDouble();
        double BMI = (int)(weight / (height * height));
        System.out.println("Your BMI is " +BMI);//!!!!!!!!!!!!!!!!!!!!!!!




    }
}
