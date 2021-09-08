package Primitives;

public class LogicalOperationPractice {
    public static void main(String[] args) {

        /*
        you need to pass course
        - if you attend 95% og the classes or
        - you get 70% as passing score out of 100%

         */

        int attend = 95;
        int score = 70;
        int myAttend = 90;
        int myScore = 65;
        boolean pass = myAttend >= attend || myScore > score;
        System.out.println(!pass);

    }
}
