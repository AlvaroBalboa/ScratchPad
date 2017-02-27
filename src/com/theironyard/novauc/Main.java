package com.theironyard.novauc;

public class Main {

    public static CountTriple test = new CountTriple();
    public static void main(String[] args) {
	// write your code here
        int howMany =test.countTriples("abcXXXabccc");
        System.out.println(howMany);
    }
}
