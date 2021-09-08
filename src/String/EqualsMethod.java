package String;

public class EqualsMethod {
    public static void main(String[] args) {
        String a = "David";
        String b = "David";

        String c = new String("David");
        String d = new String("David");

        System.out.println(a==b);//true
        System.out.println(a.equals(b));//true
        System.out.println(a==c);//false
        System.out.println(a.equals(c));//true
        System.out.println(d == c);//false
        System.out.println(d.equals(c));//true
        System.out.println(a == "David"); //true
        System.out.println(a == new String("David"));//false

        String e = a;
        String f = c;
        System.out.println(e == b);//true
        System.out.println(f.equals(d));//true
    }
}
