package Primitives;

public class ModulusPractice {

    public static void main(String[] args){

        //Modulus--> "%"--> modulus give the reminder of division

        int studentCount = 9;
        int divisor = 2;
        int resultOfDivision;
        resultOfDivision = studentCount/divisor;
        System.out.println("The result is "+resultOfDivision);//result --> 4
        int reminder = studentCount%divisor;
        System.out.println("The reminder is "+reminder);//result --> 1
        double reminder1 = studentCount%divisor;
        System.out.println(reminder1);//result --> 1.0


        int x = 15; // I want to divide 15 by 6 and find the reminder
        int number = x % 6;
        System.out.println(number);// remaider - 3








    }
}
