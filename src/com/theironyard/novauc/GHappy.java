package com.theironyard.novauc;

/**
 * Created by souporman on 2/23/17.
 */
/**
 We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately
 to its left or right. Return true if all the g's in the given string are happy.

 gHappy("xxggxx") → true
 gHappy("xxgxx") → false
 gHappy("xxggyygxx") → false
 * */
public class GHappy {
    public boolean gHappy(String str) {

        char [] stringArray = str.toCharArray();
        boolean isHappy=false;

        if(stringArray.length==0){
            isHappy=true;
        }
        else if(stringArray.length==1){
            if(stringArray[0]!='g')
                isHappy=true;
        }
        else{
            for(int i=stringArray.length-1;i>=1;i--){
                if (stringArray[i]=='g'){
                    if (stringArray[i-1]=='g'){
                        isHappy=true;
                    }
                    if(stringArray[i-1]!='g'){
                        isHappy=false;
                        if (i<=stringArray.length-2&&stringArray[i+1]=='g'){
                            isHappy=true;
                        }
                        break;
                    }
                }

            }
        }
        return isHappy;
    }
}
