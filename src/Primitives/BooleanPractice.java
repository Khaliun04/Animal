package Primitives;

public class BooleanPractice {

    public static void main(String[] args) {

        //we can use boolean for -->passport,test ect
  //For a boolean data type, I can only give value of "true and false". Thea are just refrense not a word
        boolean Right=true;
        boolean left= false;

        boolean isLightOn= true;//I can only type for first letter small for "true and false"
        boolean isBreakTime;
        isBreakTime = isLightOn;
        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        int num = 6;
        int num1 = num;
        System.out.println(num1);

        boolean isClear = false;

        System.out.println(isClear);
        //System.out.println(isBreakTime+isClear); it is not compile
        System.out.println("!!!!!!!!!"+isBreakTime+isClear);


        boolean bl = true; // work/yes/on/open
        boolean bl2 = false; // not work, off, no, closed

        int i1 = 5;
        int i2 = 5;
        int i3 = 10;
        i1 = i2; // it is work

        // is i1 = i2? yer--> true i1 == i2 --> true
        // is i1 =i3? no--> false i1 == i3 --> false

        boolean isi1EqualsToi2 = i1 == i2;
        System.out.println(isi1EqualsToi2);

        boolean isi1EqualsToi3 = i1 == i3;
        System.out.println(isi1EqualsToi3);
    }
}
