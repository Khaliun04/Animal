package Primitives;

public class LogicalOperatorPractice2 {
    public static void main(String[] args) {

        int ageMin = 5;
        int ageMax = 12;
        int height = 46;
        int myAge = 3;
        int myHeight = 36;

        boolean result = (myAge >= ageMin && myAge <= ageMax) && myHeight > height;
        System.out.println(result);//false

        myAge = 12;
        myHeight = 50;

        boolean result2 = (myAge >= ageMin && myAge <= ageMax) && myHeight > height;
        System.out.println(result2);//true

    }
}
