package Primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        // ==, !=, >, <, >=,

        int x = 10;
        int y = 10;
        int z = 65;

        boolean result1 = x == y;
        System.out.println(result1);//true

        char ch1 = 'A';
        char ch2 = 65;
        char ch3 = 66;

        boolean result2 = ch1 == ch2;
        System.out.println(result2);//true

        boolean result3 = z == ch2;
        System.out.println(result3);//true

        boolean result4 = z == ch3;
        System.out.println(result4);//false

        boolean result5 = x > y;
        System.out.println(result5);//false

        boolean result6 = x < y;
        System.out.println(!result6);//true

        boolean r7 = result1 == result2;
        System.out.println(r7);//true

        //boolean r8 = result1 > result2 --> it is compile time error. It can't be one true greater (less) or
        // greater than equals (less). "true >(<, >=, <=) true --> it's not work. But I can use "!=" this

        boolean r9 = result1 != result2;
        System.out.println(r9);//false


    }
}
