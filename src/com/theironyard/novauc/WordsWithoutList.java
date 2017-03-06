package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.List;

/**

 Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

 wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
 wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
 wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]

 */
public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList ret = new ArrayList();
        for(String rotate: words) {
            if (rotate.length() == len) {
                String throwAway = rotate;
            }
            else{
                ret.add(rotate);
            }
        }
        return ret;
    }
}
