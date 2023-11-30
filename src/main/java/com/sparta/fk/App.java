package com.sparta.fk;

import java.util.ArrayList;

public class App {

    public static String encode(String plainText) {

        StringBuilder encodedMessage = new StringBuilder();

        int count = 1;
        int i;


        for (i = 1; i < plainText.length(); i++) {

            if (plainText.charAt(i) == plainText.charAt(i - 1)) {

                count++;


            } else {

                encodedMessage.append(count).append(plainText.charAt(i-1));
                count=1;

            }

        }

        encodedMessage.append(count).append(plainText.charAt(i-1));

        String finalMessage = encodedMessage.toString();


        return finalMessage;
    }

    public static void main(String[] args) {

        System.out.println(encode("aaaabcccaaa"));

    }
}
