package Primitives;

public class CompountAssigment {
    public static void main(String[] args){

        int carNumber = 7;
        carNumber = carNumber + 5;
        System.out.println(carNumber);// 12

        carNumber += 5;
        System.out.println(carNumber);//17

        carNumber /= 2;
        System.out.println(carNumber);//8

        int count;
        count = carNumber * 2;
        System.out.println(count);//16
        int count1;
        //count1 += 10; --> it is not compile. Bc count1 does not have value

        count -= carNumber;
        System.out.println(count);//8

        int payment = 50;
        payment *= carNumber;
        System.out.println(payment);//400

        int modulus = 1;
        modulus %= payment;
        System.out.println(modulus);//1






    }
}
