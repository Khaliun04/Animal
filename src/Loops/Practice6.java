package Loops;

public class Practice6 {
    public static void main(String[] args) {

        /*
        Summer  --> print out every single letter from this word one by one
        S,u,m,m,e,r
         */

        String word = "Summer";

        int a = 0;
        while(a < word.length()){
            System.out.print(word.charAt(a)+ ",");
            a++;
        }
    }
}
