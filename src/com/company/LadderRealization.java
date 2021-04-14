package com.company;

public class LadderRealization {

    public static void main(String[] args) {
        Ladder ladderDefault = new Ladder();
        Ladder ladderEqual = new Ladder("EQUAL", 200, 210, "Steel");
        Ladder ladderLittleGiant = new Ladder("Little Giant", 180, 180, "Steel",
                false, "black", 14, 30, false, "Italy", 2.25);
        System.out.println(ladderDefault);
        System.out.println(ladderEqual);
        System.out.println(ladderLittleGiant);

        Ladder.printStaticAmountOfLadder();
        ladderEqual.printAmountOfLadder();
    }
}
