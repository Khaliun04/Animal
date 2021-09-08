package Primitives;

public class RemainderPractice1 {

    public static void main(String[] args){

        int number = 123;
        int firstDigit = number % 10;
        System.out.println(firstDigit);

        number = number / 10;
        System.out.println(number);

        int secondDigit = number % 10;
        System.out.println(secondDigit);

        number = number/10;
        System.out.println(number);

        int thirdDigit = number % 10;
        System.out.println(thirdDigit);

        System.out.println("The sum of the digit is " +(firstDigit+secondDigit+thirdDigit));
    }
}
