package com.theironyard.novauc;

/**
 * Created by souporman on 2/23/17.
 */
/**
 Given a string, return the length of the largest "block" in the string. A block is a
 run of adjacent chars that are the same.

 maxBlock("hoopla") → 2
 maxBlock("abbCCCddBBBxx") → 3
 maxBlock("") → 0
 * */
public class MaxBlock {
    public int maxBlock(String str) {
        char currentChar;
        int maxRun = 0;
        char[] stringArray = str.toCharArray();
        if (stringArray.length == 0) {
            maxRun = 0;
        } else {
            maxRun=1;
            currentChar=stringArray[0];
            for (int i = 0; i < stringArray.length-1; i++) {
                char loopChar = stringArray[i];
                int loopRun=1;
                if (currentChar==loopChar){
                    loopRun=maxRun;
                }
                currentChar=loopChar;
                if (stringArray[i + 1] == loopChar) {
                    loopRun++;
                }
                else if(stringArray[i+1]!=loopChar){
                    loopRun--;
                }
                if(loopRun>maxRun){
                    maxRun=loopRun;
                }
            }
        }
        return maxRun;
    }
}
