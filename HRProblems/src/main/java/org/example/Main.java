package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("pangram: " + isPangram("thisisnotpangram"));
        System.out.println("password: " + validPassword("password"));
        System.out.println("password: " + validPassword("Pa$sw0rd"));
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

    // check if password is valid
    // reqs are at least 6 characters, no spaces
    // a lowercase letter, an uppercase letter, special character, and a digit
    public static boolean validPassword(String S) {
        boolean lower = false;
        boolean upper = false;
        boolean special = false;
        boolean digit = false;
        if (S.length() < 6) {
            return false;
        }
        if (S.contains(" ")) {
            return false;
        }
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLowerCase(S.charAt(i))) {
                lower = true;
            }
            if (Character.isUpperCase(S.charAt(i))) {
                upper = true;
            }
            if (!Character.isDigit(S.charAt(i)) && !Character.isAlphabetic(S.charAt(i))) {
                special = true;
            }
            if (Character.isDigit(S.charAt(i))) {
                digit = true;
            }
        }
        return lower && upper && special && digit;
    }
}
