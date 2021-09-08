package String;

import java.util.Scanner;

public class Task {
    public static void main(String[] args){

        /*
        get a string from User via scanner and:
                      - print:
                      - first char
                      - last char
                      - index of second matching letter 'c'
                      - length of string
                      - index of x
         */
        Scanner text = new Scanner(System.in);

        System.out.println("please enter word");
         String word = text.nextLine();
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.indexOf("c",word.indexOf('c')+1));
        System.out.println(word.length());
        System.out.println(word.indexOf('x'));
    }
}
