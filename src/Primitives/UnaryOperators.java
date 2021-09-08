package Primitives;

public class UnaryOperators {
    public static void main(String[] args) {

        int studentNumber = 25;
        studentNumber = studentNumber + 1;
        studentNumber += 1;

        studentNumber++;
        System.out.println(studentNumber);//28
        ++studentNumber;
        System.out.println(studentNumber);//29

        studentNumber--;
        System.out.println(studentNumber);//28
        --studentNumber;
        System.out.println(studentNumber);//27

        studentNumber--; studentNumber--; studentNumber--;
        System.out.println(studentNumber);//24

        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++);//(24) --> it is show value first then increase
        System.out.println(++studentNumber);// (26) --> it is increase first then show

        System.out.println(studentNumber--);
        studentNumber--;
        --studentNumber;
        System.out.println(--studentNumber);//22
        System.out.println(studentNumber);//22
        System.out.println(studentNumber--);//22
        System.out.println(studentNumber);//21

        studentNumber = 22;
        int a = studentNumber++ + studentNumber++ + 5;
        a--;
        a = studentNumber;
        System.out.println(a--);//24
        System.out.println(a);//23

    }
}
