package IfStatement;

public class Practice2 {
    public static void main(String[] args) {

        int age = 15;
        int money = 200;

       if (age >=18 ){
           System.out.println("You can go to picnic");
       }
       if (money>= 100){

           System.out.println("You can go to picnic with this amound of "+money);
       }
       // combine these 2 conditions to create an if statement which will accept either of condition age or money
        // print "You are okay with one of the requirement
        if(age >= 18 || money >= 100){
            System.out.println("You are okay with one of the requirement");
        }
    }
}
