package Primitives;

public class Precedence {

    public static void main(String[] args) {

        int count = 10 + 15;
        int count1 = count + 3 * 5;
        System.out.println(count);// 25
        System.out.println(count1);//40

        int count2 = count - count1 / 2 * 3;
        System.out.println(count2);//- 35

        int count3 = 6 / 3 * 5 % 3;
        System.out.println(count3);//1

        int count4 = 6 - 4 - count + count3;
        System.out.println(count4);// -22

        // 50 food, 250 for elect, 80 shoes
        //     10%        20%        15%
        // How much total price
        // totalTax = 50 * 0.1 + 250 * 0.2 + 80 * 0.15
        // sout(totalTax);
        // totalPayment = 50 + 250 + 80 + totalTax; discount with %

        double payment = 50 + 250 + 80 + 50 * 0.1 + 250 * 0.2 + 80 * 0.15;
        System.out.println(payment);//447.0

        double number = (20 * (0.1 + 500) * 2 + 30) * 0.7;
        System.out.println("number -->" + number);


        
    }
}
