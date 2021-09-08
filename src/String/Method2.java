package String;

public class Method2 {
    public static void main(String[] args) {

        String name= "Diana";

        System.out.println(name.indexOf('D'));//('') here I can't use more than one character
        System.out.println(name.indexOf("D"));//("") here I can use more than one character
        System.out.println(name.indexOf("Di"));//index number of "0" -->0
        //Once you provide more than one character in the indexOf method it is looking first matching sequence.
        System.out.println(name.indexOf("ana"));//2 --> it looks for matching sequence of provide char
                                                //and returns first matching char's index number
        System.out.println(name.indexOf("ina"));//-1 there is matching char sequence (it will be always -1)
                                                // It is just not matching meaning.
        System.out.println(name.indexOf("k"));
        System.out.println("this is saturday morning");

        name = name.concat(" Bejan");
        System.out.println(name);//Diana


        name.indexOf("a");//--> 2
        System.out.println(name.indexOf("a"));

        name.indexOf("a",3);//--> it will start looking for that char starting from given index
        System.out.println(name.indexOf("a",3));//4

       name.indexOf("B", name.indexOf(" "));//result 6
        System.out.println(name.indexOf("B", name.indexOf(" ")));

        String name1 = new String("Arzu Beril Sen");
        System.out.println(name1.indexOf("e",7));//12
        


    }
}
