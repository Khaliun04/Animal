package Primitives;

public class RemainderPractice3 {

    public static void main(String[] args){

        // by using % operator
        //$875 -- $100 for each month
        //print last month's payment which is $75

        int phonePrice = 875;
        int monthlyPayment = 100;
        int lastMonthPayment = phonePrice % monthlyPayment;
        System.out.println("$" +lastMonthPayment);
        

        boolean bl = true;
        boolean bl1 = true;
        //boolean bl + bl1; --> it is not possible. it is compile time error

        String a = "David";
        String b = "Sauza";
        String c = a +b;
        System.out.println(c);// It is called Concatenation.


        double d = 9/2;

    }

}
