package Loops;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        /*
        user user 100$
        as
         */

        Scanner scnner = new Scanner(System.in);


        double money = 100;

          while(money>0) {
              System.out.println("How much do yuo want spend");
              double spending = scnner.nextDouble();
              if (spending<=money){
                  money -= spending;
                  System.out.println("Your blance is "+money);
              }else {
                  System.out.println("You don't have ehough monye in the account!! your blance is" +money);
              }

          }
    }
}
