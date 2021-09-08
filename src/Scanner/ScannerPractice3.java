package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName = scanner.next();//it recognize word before the first space. It is looking for scape
                                         // it's stop there ("DavidBrown" , "david_brown" recognize this)
        System.out.println("Your entered this value --> " +fullName);

        System.out.println("Please enter your state ");
        char firstLetter = scanner.next().charAt(0);// indexing
                                                    // I l l i n o i s
                                                    // 1 2 3 4 5 6 7 8 --> letter count is 8
                                                    // 0 1 2 3 4 5 6 7 --> indexing
        System.out.println(firstLetter);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullNam = input.nextLine();




    }
}
