package Primitives;

public class DataTypes {

    public static void main(String[] args) {

        byte number = 6;
        byte number1 = 127;
        // for the byte range is -128 to 127, higher than 127, lower than -128 are not compile for the byte
        //

        short number2 = 100;
        short number3 = 31789;


        int number4 = 32000; //(32_000) I can use "_ " in between the digits. it is not effected the value
        int number6 = 1_000_000; // (1000000)
        System.out.println(number6);


        long number5 = 341354;
        long number7 = 4_778_754_294_658_679l; // I should use "L/l" at the end of long value. "L" is only java now it's a long value
        System.out.println(number7);


        float number8 = 2.3f; // I should use "f/F" at the end of float values
                // 2.3   56.0-->56
        float number9 = 56;//56.0 -->56
        System.out.println(number9);
        float number10 = 56.0f;
        //int number11 = 6.5--> it is not compile. I can't store decimal value in int data type


        double number12 = 2.1;
        double number13 = 89; // 89-->89.0  double data type can store int values
        System.out.println(number13);

        //most common primitive data type usages are int, double, long, boolean









    }
}
