package IfStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {

        // appleNumber = 20
        // orangeNumber = 30

        int appleNumber = 40;
        int orangeNumber = 30;

        if(appleNumber > orangeNumber)
            appleNumber++;
            System.out.println("There are more apple in the store than oranges " + appleNumber);

        if(orangeNumber > appleNumber)
            orangeNumber++;
            ++orangeNumber;
            System.out.println("There are more or orange in the store than apple " + orangeNumber);

    }
}
