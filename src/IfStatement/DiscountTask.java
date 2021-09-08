package IfStatement;

public class DiscountTask {
    public static void main(String[] args) {

        /*
        if your payment 100$ more you'll get 20% discount
        otherwise you'll get 5% discount
         */

        double money = 100;

        if(money >= 100){
            money -= money * 0.2;
            System.out.println("Your payment is after 20% off" +money);
        }
        else {
            money -= money * 0.05;
            System.out.println("Your payment is after 5% off" +money);
        }
    }
}
