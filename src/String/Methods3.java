package String;

public class Methods3 {
    public static void main(String[] args) {

        String string = "Selenium";

        //.toUpperCase(); // it will convert all string to upper case
        string = string.toUpperCase();
        System.out.println(string);
        //.toLowerCase(); it will convert all string to lower case
        string.toLowerCase();
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string);
        string = string.toLowerCase();
        //string.charAt(0).toUpperCase --> it is not compile.Bc char is primated data, so it is not call method
        String a = ""+string.charAt(0);//--> making rest of string
        a = a.toUpperCase();
        System.out.println(a);
        System.out.println(a + string);


        String word = "do whatever it takes";
        System.out.println(word.startsWith("do")); //--> true
        System.out.println(word.startsWith("what")); //-->false
        System.out.println(word.startsWith("d")); //-->true
        System.out.println(word.startsWith("d o")); //-->false

        boolean result1 = word.startsWith("do w");
        System.out.println(result1); //-->true

        boolean result2 = word.startsWith("Do");
        System.out.println(result2); //-->false

        System.out.println(word.startsWith("do whatever it takes"));//ture

        System.out.println(word.endsWith("do")); //-->false
        System.out.println(word.endsWith("s"));  //-->true
        System.out.println(word.endsWith("es")); //--> true
        System.out.println(word.endsWith("takes")); //-->true
        System.out.println(word.endsWith("takeS"));//-->false
        System.out.println(word.endsWith("it"));//-->false
        System.out.println(word.endsWith("it takes"));//-->ture

        String text = "Techtorial";
        System.out.println(text.contains("Tech")); //--> true
        System.out.println(text.contains("for")); //--> false
        System.out.println(text.contains("i")); //--> true
        System.out.println(text.contains("t")); //--> true



    }
}
