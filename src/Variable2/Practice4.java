package Variable2;

public class Practice4 {

    public static void main(String[] args){

        /* in a farm,
        there are 12 cows and 23 chickens
        each chicken's cost is 10$
        each cow's cost is 500$
        1. calculate the total number of legs of the animals in this farms

         */
        int chickens = 23, cows = 12, chickenLegs = 2, cowLegs = 4;
        int totalLegs = chickens * chickenLegs + cows * cowLegs;
        System.out.println(totalLegs);
        int chickenPrice$ = 10, cowPrice$ = 500;
        int totalPrice  = chickens * chickenPrice$ + cows * cowPrice$;
        System.out.println(totalPrice);

    }
}
