package String;

public class StringBasic {
    public static void main(String[] args) {

        String text = "School";
        String name = new String("David");
        System.out.println(text);//School
        System.out.println(name);//David

        text = text + "is Techtorial";
        System.out.println(text);

        text+= " Academy";
        System.out.println(text);

        //text -= "dsfvefv" --> It is not compile. The plus is different plus for mathematical plus.
        // It is adding words make a text. We can't use (-,*,/,%) does.

        String word = name + " " +text;
        System.out.println(word);//DavidSchool is Techtorial Academy

        name = name +" " + text;//Also I can do this
        name += " " +text;
        System.out.println(name);

        String str = "Java";
        String str1 = "Salenium";
        String result = str +" " +str1;
        System.out.println(result);
        System.out.println(str1+ " is next");
        System.out.println(str + " is first");

        str = str + 6 +5;
        System.out.println(str);//Java56

        str1 = str1 + "5" + "6";
        System.out.println(str1);//Salenium56
        result = 5 * 6 + result;
        System.out.println(result);//30JavaSalenium

        str = "Java";
        str = str + 5*6;
        System.out.println(str);//Java30
        System.out.println(str+15/3);//Java305

        str = "Java";
        int a = 5;
        str.concat(" is cool");
        System.out.println(str);//Java

        str = str.concat(" is very easy");
        System.out.println(str);

        str.toUpperCase();
        str = str.toUpperCase();
        System.out.println(str);//JAVA IS VERY EASY


        String number = "1";
        number +="2";
        number +=2;
        System.out.println(number);


    }
}
