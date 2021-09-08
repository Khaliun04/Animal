package String;

public class MethodChaining {
    public static void main(String[] args) {

          /*
        TASK:
         - Replace all letter 'a's with single '*' and letter 'e' double '**',
         - Change all string value to UpperCase
         - Find index of First '*'
         - Multiply that value by 10 and
         - Print out the result
         - Find and print out middle chars index number

         */

        String text = "      just do it  *   ";
        int x = text.replace('a','*').trim().replace("e","**").toUpperCase().indexOf('*');
        // end of this give number (Primitive data) so I can't continue. "primitive data don't have method
        char y= text.replace('a','*').trim().replace("e","**").toUpperCase().charAt(0);
        String z = text.replace('a','*').trim().replace("e","**").toUpperCase();

        System.out.println(x); //giving me number
        System.out.println(y); //giving me character
        System.out.println(z); //giving me string



    }
}
