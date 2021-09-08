package HomeWork;

public class Taskg {
    public static void main(String[] args) {
        String str1 = "Tutorial GateWay";
        String str2 = "TUTORIAL GATEWAY";
        String str3 = new String("TUTORIAL Gateway");
        String str4 = new String("Tutorial GATEWAY");
        String str5 = new String("Java Programming");

        boolean a = str1.equals(str2); //false
        System.out.println(a);

        boolean b = str3.equalsIgnoreCase(str4); //true
        System.out.println(b);

        boolean c = str2.equalsIgnoreCase(str4); // true
        System.out.println(c);

        boolean d = str1.equalsIgnoreCase(str3);//true
        System.out.println(d);

        boolean e = str1.equalsIgnoreCase(str5); // false
        System.out.println(e);

    }
}
