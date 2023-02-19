package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPangram("thisisnotpangram"));
    }

    // check if string is a pangram
    public static boolean isPangram(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        boolean pangram = true;
        String lows = s.toLowerCase();
        for (int i = 0; i < alpha.length(); i++) {
            if (!lows.contains(String.valueOf(alpha.charAt(i)))) {
                pangram = false;
            }
        }
        return pangram;
    }
}
