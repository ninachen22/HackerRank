package org.example;

import java.util.Arrays;

public class Main {
    static int[] arr = new int[]{3, 6, 4, 1, 2};
    static Integer[] testArr = {7,1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println("pangram: " + isPangram("thisisnotpangram"));
        System.out.println("password: " + validPassword("password"));
        System.out.println("password: " + validPassword("Pa$sw0rd"));
        System.out.println("smallest int: " + smallestPosIntNotInArr(arr));
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

    /*
    Write a function:
    that, given an array A of N integers,
    returns the smallest positive integer (greater than 0) that does not occur in A.

    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    Given A = [1, 2, 3], the function should return 4.
    Given A = [−1, −3], the function should return 1.
    */
    public static int smallestPosIntNotInArr(int[] A) {
        Arrays.sort(A);
        if (!looks(A, 1)) {
            return 1;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > 0 && A[i] + 1 != A[i + 1] && A[i] != A[i + 1]) {
                return A[i] + 1;
            }
        }
        return A[A.length - 1] + 1;
    }

    public static boolean looks(int[] arr, int n) {
        int beg = 0;
        int end = arr.length - 1;
        int mid;
        while (end >= beg) {
            mid = beg + (end - beg) / 2;
            if (n == arr[mid]) {
                return true;
            } else if (n < arr[mid]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return false;
    }

    // given an int arr
    // find subarr within arr with largest sum

}
