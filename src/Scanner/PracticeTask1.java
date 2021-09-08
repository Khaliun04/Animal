package Scanner;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);

        int yourBank = 200;

        System.out.println("How much do you wanna deposit ?");
        int firstDeposit = mn.nextInt();
        System.out.println("How much do you wanna deposit ?");
        int secondDeposit = mn.nextInt();
        System.out.println("How much do you wanna deposit ?");
        int thirdDeposit = mn.nextInt();
        int bankAcount = yourBank + firstDeposit +secondDeposit+thirdDeposit;
        System.out.println("How much do you want to pay for phone ?");
        int phone = mn.nextInt();
        System.out.println("How much do you want to pay for headphones ?");
        int headphone = mn.nextInt();
        int balanceLeft = bankAcount -phone -headphone;
        System.out.println("Your balance is "+balanceLeft);
    }
}
