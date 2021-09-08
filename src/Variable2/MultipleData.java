package Variable2;

public class MultipleData {

    public static void main(String[] args){

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;

        int a, b, c, d, e; //it is okay to declare variables on a single line

        int x=2, y=3, z=4, w=5; // it is okay to declare and initialize multiple variables on a single line
                                //x, y, z, w are same data types, so it is okay for typing one line

        a = x + y; //a=2+3-->5

        num4 = 99;
         System.out.println("The value of a -->"+ a);

         // itn k, byte r, short m; --> this is not compile bc of the comma
       /* int k,
        byte r,
        short m; --> this is not compile bc of the comma. doesn't matter it is not okay for they're typing different line too
        */

        int k; byte r; short m; // it is ok



    }
}
