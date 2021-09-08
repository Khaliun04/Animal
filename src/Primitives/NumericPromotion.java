package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {

          byte b1 = 112;

          short sh1 = 30;

          // byte sum1 = b1 + sh1; --> Bc when I use arithmetic operator with short and byte, data type
        // automaticlly promoted to int

        int sum1 = b1 + sh1;

        float f1 = 2.3f;

        double d1 = 3.4;

        //float sum2 f1 + d1;--> smaller data type can't contain big data type

        System.out.println(f1+d1); // this is work. Bc it is not stored numbers. It is just show result

        double sum2 = f1 + d1;
        System.out.println(sum2);

        // int sumTotal = sum1 * sum2; --> result is a decimal number. That is why I can't store it in int data type
        double sumTotal = sum1 * sum2;

        int i1 = 23;
        double db1 = i1;
       // itn db1 = i1 --> it is not compile

       //long l1 = db1; --> this is not compile to


    }
}
