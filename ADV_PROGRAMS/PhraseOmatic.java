package com.company;

public class PhraseOmatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multiplier","30 foot","B-to-B","win win","web based","smart","six sigma","dynamic"};
        String[] wordListTwo = {"45/6","divisor","78 foot","A-to-A","loss loss","web service","dumb","loser","dead"};
        String[] wordListThree = {"69/5","fired","shared","portal","focused","branded","aligned","space","Thinking "};

        int oneLength = wordListOne.length;
        int TwoLength = wordListTwo.length;
        int ThreeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * TwoLength);
        int rand3 = (int) (Math.random() * ThreeLength);

        String phrase = wordListOne[rand1] + " " +wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a "+phrase);
    }
}
