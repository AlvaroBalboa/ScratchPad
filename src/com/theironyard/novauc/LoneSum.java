package com.theironyard.novauc;

/**
 Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

 loneSum(1, 2, 3) → 6
 loneSum(3, 2, 3) → 2
 loneSum(3, 3, 3) → 0

 */
public class LoneSum {
    public int loneSum(int a, int b, int c) {
        boolean absame=false;
        boolean bcsame=false;
        boolean casame=false;
        if(a==b){
            absame=true;
        }
        if(b==c)
            bcsame=true;
        if(c==a)
            casame=true;
        if(absame){
            if(bcsame){
                return 0;
            }
            return c;
        }
        if(casame)
            return b;
        if(bcsame)
            return a;

        return a+b+c;
    }
}
