package Scanner;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);

        System.out.println("Please enter your name");
        char thirdLetter = game.next().charAt(2);
        System.out.println("Your name third letter is '"+thirdLetter +"'");
    }
}
