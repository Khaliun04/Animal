package Loops;

public class Practice2 {
    public static void main(String[] args) {

        /*
        print out "I'm here today"
        for the ages from 23 - 26
        after 26 print --> "I'm not here"
         */


        int age = 23;
        System.out.println("I am not here");

        while (age <= 26){
            System.out.println("I am here");
            age++;
        }
        System.out.println("I am not here");


        // print out number between 10 to 20

        int number = 10;

        while( number <= 20){
            System.out.println(number);
            number++;
        }
    }
}
