package Primitives;

public class LogicalNegation {
    public static void main(String[] args) {

        boolean haveMoney = false;
        System.out.println(haveMoney);//false

        // !haveMoney = false // It's not compile. Bc it is new name. This is compile time error

        System.out.println(!haveMoney);

        boolean isCarOn = true;
        isCarOn = ! false;
        System.out.println(isCarOn);





    }
}
