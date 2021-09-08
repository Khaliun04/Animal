package String;

public class Method4 {
    public static void main(String[] args) {

        String a = "John";
        String b = "John";
        String c = "JOHN";

        boolean bl1 = a.equals(b);
        boolean bl2 = a.equals("John");
        boolean bl3 = a.equals(c);

        System.out.println(bl1); //true
        System.out.println(bl2); //true
        System.out.println(bl3); //false

        boolean bl4 = a.equalsIgnoreCase(c);//-->ture
        System.out.println(bl4);

        System.out.println("Java is ".equalsIgnoreCase("JAVA is "));// -->true
        System.out.println("Java is cool".equalsIgnoreCase("JAVA is "));//-->false

        String str1 = "Java is cool";
        str1 = str1.replace("o","$");
        System.out.println(str1);

        str1 = str1.replace("c$$l", "easy");
        System.out.println(str1);

        String str2 = "Tava";
        str1 = str1.replace("Java",str2);
        System.out.println(str1);

        System.out.println(str1.replace("***","???")); //nothing happened

        String star = "Star of the day is *";
        System.out.println(star.replace("***","???"));// nothing happened
        System.out.println(star.replace("*","???"));


        String text = "   It is Saturday   ";
        System.out.println(text);
        text = text.trim();
        System.out.println(text);

        /*
        "Do whatever it takes"
        concat with "to learn Java"
        make everything to upperCAse
        replace "Java" with "JBD"
        check if the text contains "Chicago"
         */

        String word = "Do whatever it takes";
        word = word.concat("to learn Java");
        System.out.println(word);
        word = word.toUpperCase();
        System.out.println(word);
        word = word.replace("JAVA","JBD");
        System.out.println(word);
        System.out.println("does it contain Chicgo -->"+(word.contains("Chicago")));
        System.out.println(word);
        word = word.replace("LEARN","GET");
        System.out.println(word);


    }
}
