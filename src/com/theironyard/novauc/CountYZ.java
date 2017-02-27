package com.theironyard.novauc;

/**
 * Created by souporman on 2/23/17.
 */
/**
 Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in
 "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of
 a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char)
 tests if a char is an alphabetic letter.)

 countYZ("fez day") → 2
 countYZ("day fez") → 2
 countYZ("day fyyyz") → 2

 * */
public class CountYZ {
    public int countYZ(String str) {
        int ysAndzs = 0;
        String[] wordsNon = str.split("\\W");
        String[] wordsDigit = str.split("\\d");
        String[] wordsSpace = str.split("\\S");
        int space = 0, non = 0, digit = 0;

        for (String iterate : wordsNon) {
            if (iterate.endsWith("y") || iterate.endsWith("Y") || iterate.endsWith("z") || iterate.endsWith("Z")) {
                non++;
            }
        }
        for (String iterate : wordsDigit) {
            if (iterate.endsWith("y") || iterate.endsWith("Y") || iterate.endsWith("z") || iterate.endsWith("Z")) {
                digit++;
            }
        }
        for (String iterate : wordsSpace) {
            if (iterate.endsWith("y") || iterate.endsWith("Y") || iterate.endsWith("z") || iterate.endsWith("Z")) {
                space++;
            }
        }
        ysAndzs = non;
        if (non < space) {
            ysAndzs = space;
        }
        if (non < digit) {
            ysAndzs = digit;
        }

        return ysAndzs;
    }
}
