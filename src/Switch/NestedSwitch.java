package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        /*
        You're make call to company
        There are 3 departmnet
        1.  IT --> We have Raj, Alex, Jessi
        2.  HR --> Ana, Tima
        3.  REP --> Jeremiah, John, David
        ask user "Whitch department they're want to talk them
        ask "who do they want to talk with?
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Whitch department you waht to talk IT - 1, Hr - 2, REP - 3");

        int departmentNumber = scanner.nextInt();
        switch (departmentNumber) {
            case 1:
                scanner = new Scanner(System.in);
                System.out.println("Who do want to talk with");
                String name = scanner.nextLine();
                switch (name.toLowerCase()) {
                    case "raj":
                        System.out.println("You transferring to Raj");
                        break;
                    case "alex":
                        System.out.println("You transferring to Alex");
                        break;
                    case "jesse":
                        System.out.println("You transferring to Jess");
                    default:
                        System.out.println("Invalid selection");
                        break;

        }break;


                    case 2:
                        scanner = new Scanner(System.in);
                        System.out.println("Who do want to talk with");
                        String name1 = scanner.nextLine().toLowerCase().trim();
                        switch (name1) {
                            case "Ana":
                                System.out.println("You transferring to Ana");
                                break;
                            case "Tima":
                                System.out.println("You transferring to Tima");
                                break;
                        }break;


                    case 3:
                        scanner = new Scanner(System.in);
                        System.out.println("Who do want to talk with");
                        String name2 = scanner.nextLine();
                        switch (name2.toLowerCase()) {
                            case "Jeremiah":
                                System.out.println("You transferring to Jeremiah");
                                break;
                            case "John":
                                System.out.println("You transferring to John");
                                break;
                            case "David":
                                System.out.println("You transferring to David");
                            break;


                        }break;


                    default:{
                        System.out.println("You entered wrong number");

                }
        }

    }
}