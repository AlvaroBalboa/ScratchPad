package com.theironyard.novauc;

/**

 Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

 blackjack(19, 21) → 21
 blackjack(21, 19) → 21
 blackjack(19, 22) → 19
 */
public class BlackJack {
    public int blackjack(int a, int b) {
        if(a>21)
            a=0;
        int highest=a;
        if(b>21)
            b=0;
        if(b>a)
            highest=b;
        return highest;
    }

}
