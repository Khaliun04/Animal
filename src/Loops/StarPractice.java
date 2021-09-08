package Loops;

public class StarPractice {
    public static void main(String[] args) {

        // 5 ==>
        // *
        // **
        // ***
        // ****
        // *****

        int number = 0;

        String star = "";
        while (number<5){
           // star = star+ "*";
            star = star.concat("*");
            System.out.println(star);
            number++;
        }
    }
}
