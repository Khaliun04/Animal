package HomeWork;

public class HomeWork1 {

    public static void main(String[] args){

        /*TASK 1 - Create 3 variable to store your
        age, height, weight and print them using println
          */

        double myAge = 30;
        double myWeightKg = 60;
        double myHeightCm = 170;

        System.out.println(myAge);
        System.out.println(myWeightKg);
        System.out.println(myHeightCm);

         /*TASK 2 - Using Java calculate the person's body mass index and print the result with  different
        Examples.
        Note: Body Mass Index is simple calculation using a person's height and weight.
        The formula is
        BMI= kg/m2 where kg is a person's weight in kilograms and m2 is their height in
        metres squared.

        BMI = body mass index
        m = mass(in kilograms)
        h = height(in meters)
         */

        double myMassKg = 83;
        double myHeight = 176;

        double BMI = myMassKg / myHeightCm;
        System.out.println("my BMI is:"+BMI);


         /*TASK 3 - Write the java program that converts given kilogram values to pound and grams.
        Example:
        8 kg
        Output:
        17.64 pounds
        8000 grams
        Note: for an approximate result of kg to pound, multiply the mass value by 2.205
         */

        double kg = 8;
        double pound = 17.64;
        double pound1 = pound / kg;
        System.out.println(pound1);

        double gr = 8000;
        double gr1 = gr / kg;
        System.out.println(gr1);

           /* TASK 4 - Write the java program that converts given meter value to the foot and centimeter.
        Example:
        6 meter
        Output:
        19.686 foot
        600 centimeter
         */

        double m = 6;
        double f = 19.686;
        double f1 = f / m;
        System.out.println(f1);

        double c = 600;
        double c1 = c / m;
        System.out.println(c1);

         /* TASK 5 - Write a Java program to convert temperature from Fahrenheit to Celsius degree.

        Test Data
        Input a degree in Fahrenheit:
        212
        Expected Output:
        212.0 degree Fahrenheit is equal to 100.0 in
        Celsius
         */

        double F = 212;
        double C = 100;
        System.out.println(F + "=" + C);
    }
}
