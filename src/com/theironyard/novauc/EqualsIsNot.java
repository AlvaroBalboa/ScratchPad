package com.theironyard.novauc;

/**
 * Created by souporman on 2/23/17.
 */
/**Given a string, return true if the number of appearances of "is" anywhere in the
 * string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

 equalIsNot("This is not") → false
 equalIsNot("This is notnot") → true
 equalIsNot("noisxxnotyynotxisi") → true

 * */
public class EqualsIsNot {
    public boolean equalIsNot (String str){

        char [] stringArray = str.toCharArray();
        int isCounter=0;
        int notCounter=0;

        for(int i =0;i<=stringArray.length-2;i++){
            if (stringArray[i]=='i'){
                if (stringArray[i+1]=='s'){
                    isCounter++;
                }
            }
        }
        for(int i =0;i<=stringArray.length-2;i++){
            if (stringArray[i]=='n'){
                if (stringArray[i+1]=='o'){
                    if (stringArray[i+2]=='t'){
                        notCounter++;
                    }
                }
            }
        }
        boolean isEqual= false;
        if (isCounter==notCounter)
            isEqual=true;

        return isEqual;
    }
}


