package com.theironyard.novauc;

/**
 * Created by souporman on 2/23/17.
 */
/**
 We'll say that a "triple" in a string is a char appearing three times in a row. Return the number
 of triples in the given string. The triples may overlap.

 countTriple("abcXXXabc") → 1
 countTriple("xxxabyyyycd") → 3
 countTriple("a") → 0
 * */
public class CountTriple {

    public int countTriples(String string){
        int numberOfTriples=0;
        String firstOccurance;
        String secondOccurance;
        String thirdOccurance;
        String [] inputString = new String[string.length()];
        for(int i =0;i<=string.length()-1;i++){
            inputString[i]=string.substring(i,i+1);
        }
        for(int i =0;i<string.length()-2;i++){
            firstOccurance=inputString[i];
            secondOccurance=inputString[i+1];
            thirdOccurance=inputString[i+2];
            if (secondOccurance.equalsIgnoreCase(firstOccurance)){
                if(thirdOccurance.equalsIgnoreCase(secondOccurance)){
                    numberOfTriples++;
                }
            }
        }
        return numberOfTriples;
    }
}
