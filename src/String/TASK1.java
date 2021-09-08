package String;

import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {


        /*
        TASK: Ask user to enter a String value which should have space at the beginning or end
         - Replace all letter 'a's with single '*' and letter 'e' double '**',
         - Change all string value to UpperCase
         - Find index of First '*'
         - Multiply that value by 10 and
         - Print out the result
         - Find and print out middle chars index number

         */
        Scanner word = new Scanner(System.in);
        System.out.println("Please enter String and it should have space beginning or end");

        String str = word.nextLine();
        str = str.trim();
        System.out.println(str);

        str = str.replace('a','*');
        System.out.println(str);

        str = str.replace("e","**");
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        str.indexOf('*');
        int indexOfStar = str.indexOf('*');
        System.out.println(indexOfStar);

        System.out.println(indexOfStar*10);

        String text = "Chicago";
        text.charAt(4);
        text.charAt(text.length()/2);
       int index = str.indexOf(str.charAt((str.length()-1)/2));
        System.out.println(index);


    }
}