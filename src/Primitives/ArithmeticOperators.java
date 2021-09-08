package Primitives;

public class ArithmeticOperators {

    public static void main(String[] args) {


        // arithmetic operators are +, -, *, /, %(modulus)

        int a = 9;
        int b = a + 5; // This is number of people
        int carCount = b * 2; // if each person has 2 car
        int finalCarCount = carCount - 10; // 5 people left with cars
        System.out.println(finalCarCount);
        int numberOfRows = finalCarCount / 3;
        System.out.println("I need this many rows to park all the cars: "+numberOfRows);

        double division = a/2; // result shows (4.0) why?
                              // bc --> double
        System.out.println(division);

        int division1 = a/2; // result shows (4) why?
                             // bc -->int
        System.out.println(division1);

        double division3 = a/2d; // result shows (4.5) why?
                                 // bc --> one of the operation comes from decimal number. So result shows decimal number
        System.out.println(division3);






    }
}
