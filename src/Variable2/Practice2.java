package Variable2;

public class Practice2 {

    public static void main(String[] args) {

        int apple = 10;
        int oranges = 20;
        int kiwi = 30;

        System.out.println(oranges);
        System.out.println(kiwi);

        System.out.println("Total of fruits "+apple+oranges+kiwi);// This is show 102030
        System.out.println("Total of fruits"+(apple+oranges+kiwi));// this shows correct addition
        System.out.println(apple+oranges+ " is total of apples and oranges");// result is 30.
        // Java reads to code top to bottom left to right.

        // in one line print the total number of apples and kiwis is <....>
        // and difference between kiwi and orange is <...>"

        System.out.println("The total of apple and kiwi = "+(apple+kiwi)+" The difference between kiwi and oranges = "+(kiwi-oranges));
    }
}
