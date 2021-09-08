package Primitives;

public class LogicalOperationOr {
    public static void main(String[] args) {

        int myAge = 3;
        boolean myMoney = false;
        int ageA = 12;
        boolean money = true;

        boolean result = myAge >= ageA|| myMoney == money;
        System.out.println(result);//false

        myAge = 15;

        boolean result2 = myAge >= ageA || myMoney == money;
        System.out.println(result2);



    }
}
