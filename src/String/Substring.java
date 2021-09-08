package String;

public class Substring {
    public static void main(String[] args) {

        String str = "Techtorial";
        String part1 = str.substring(2);
        System.out.println(part1);// --> chtorial
                                  // when you pass single index number into the substring method
                                  // it will take starting

        String part2 = str.substring(2,4); //ch
                                           // when you pass beginning and ending index which is included and
                                           // stop at ending index which is not included
        System.out.println(part2);

        System.out.println(str.substring(0));//Techtorial

        // print lat 3 chars from String " I will do it SOON";
        String text = "I will do it SOON";
        text = text.substring(text.length()-3);

        String text1 = "on";
        text1 = text1.substring(text1.length()-3);// when your string value doesn't have enough value take
                                               //substring it will throw an exception (StringOutOfBound)
         System.out.println(text);

         String x = "I love Java";

         String sub = x.substring(x.indexOf(" "), x.indexOf(" ", x.indexOf(" ")+1));
        System.out.println(sub);
    }
}
