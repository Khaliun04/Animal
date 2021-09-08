package Switch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        ask user to provide a number between 1 to 7
        print the matching name of the day for that number
        when user enters 1 --> "It is Monday"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the nubmer 1 to 7, it is show you days ");

        int number = input.nextInt();
        switch(number){
// You can't give same value more than one
            case 1  :
                System.out.println("Today is Monday");
                break;
            case 2  :
                System.out.println("Today is Tuesday");
                break;
            case 3  :
                System.out.println("Today is Wedneday");
                break;
            case 4  :
                System.out.println("Today is Thursday");
                break;
            case 5   :
                System.out.println("Today is Friday");
                break;
            case 6   :
                System.out.println("Today is Saturday");
                break;
            case 7  :
                System.out.println("Today is Sunday");
            default:
                System.out.println(" That is not matching number");
        }
    }
}
