package Primitives;

public class CharPractice {

    public static void main(String[] args){

        char firstLetter = 'A'; // value for a char data type needs to be single quotation mark ('A')
        System.out.println(firstLetter);

        char secondLetter = '6';
        System.out.println(secondLetter);

        char thirdLetter = '^';//"^"--> carrot sign
        System.out.println(thirdLetter);

        char forthLetter = 66;
        System.out.println(forthLetter);//it
        //char forthLetter = '66';  it is not compile. You can store only single character in single quotation mark

        char fifthLetter = 2550;
        System.out.println(fifthLetter);

        char x = 2156;  // if you assign a number for a char data type, it will print a symbol/character from ASCII table
        System.out.println(x);

        double b = '?'; // if you assign a character/symbol from ASCII table, it'll print the number/ value for it.
        System.out.println(b);

        //TASK; create a int data and assign a character for it and print it out
        int i='?';
        System.out.println(i);

        int a = 'A';
        System.out.println(a);
        int q = '2';
        System.out.println(q);

        int c = 'C',k = 'K',d = 'D',l = 'L',p = 'P',g = 'G';
        System.out.println(" "+ c +" "+ k+ " "+d +" "+ l +" "+ p +" "+ g);
        System.out.println(+ c + k+ d + l + p + g);



    }
}
