package com.theironyard.novauc;

public class Main {

    public static CountTriple test = new CountTriple();
    public static void main(String[] args) {

        //CountTriple triple = new CountTriple();

        int howMany =test.countTriples("abcXXXabccc");
        System.out.println(howMany);
    }
}
