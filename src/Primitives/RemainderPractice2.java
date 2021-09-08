package Primitives;

public class RemainderPractice2 {

    public static void main(String[] args){

        // find the product of digits from a four digit given number
        // print the result as following:
        //"The product is "

        int number = 3456;
        int firstDigit = number % 10;
        System.out.println(firstDigit);// result --> 6

        number = number/10;
        System.out.println(number);// result --> 345

        int secondDigit = number % 10;
        System.out.println(secondDigit);// result --> 5

        number = number/10;
        System.out.println(number);// result --> 34

        int thirdDigit = number % 10;
        System.out.println(thirdDigit);// result --> 4

        number = number/10;
        System.out.println(number);// result --> 3

        int fourthDigit = number % 10;
        System.out.println(fourthDigit);// result --> 3

        int product = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println(product);
    }
}
