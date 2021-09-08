package Primitives;

public class CastingPractice {
    public static void main(String[] args) {

        long l1 = 120;
        //int i1 = l1;--> larger data type can't be stored smaller data type

        int i2 = (int)l1; // This is explicit casting (Auto narrowing)
        double db1 = l1; // This is implicit casting (Auto widening)

        short apple = 800;
        short samsung = 600;

        //short total= (short)apple + samsung; --> It is not compile. Bc it is promoted to only apple
        short total= (short)(apple + samsung);
        System.out.println(total);

        byte total1 = (byte)(apple + samsung);
        System.out.println(total1); //120 -->

         byte a = 12;
         short b = a; // Implicit casting

        short c= 5;
        byte d = (byte)c;// Explicit casting

        int total2 = apple + samsung;

        double d1 = 2.3;
        int l =12;
        System.out.println(l);
        l += d1;// when you do compound assignments, you don't need to do explicit casting.
        //It'll do by self
        System.out.println(l);
        int i3 =(int) d1;
        System.out.println(i3);
        
    }
}
