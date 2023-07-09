package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int[] arr = new int[]{3, 6, 4, 1, 2};
    static Integer[] testArr = {7, 1, 2, 3, 4, 5};

    public static void main(String[] args) {
        System.out.println("pangram: " + isPangram("thisisnotpangram"));
        System.out.println("password: " + validPassword("password"));
        System.out.println("password: " + validPassword("Pa$sw0rd"));
        System.out.println("smallest int: " + smallestPosIntNotInArr(arr));

        System.out.println("largest sum of int arr");
        sortDesc(testArr);
        System.out.println(largestSum(testArr));

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
    public static void sortDesc(Integer[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] < intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
    }

    public static int largestSum(Integer[] intArr) {
        return intArr[0] + intArr[1];
    }

    // Simple Array Sum
    // given an arr of ints, find sum of its elements
    public static int simpleArraySum(List<Integer> ar) {
        Integer sum = ar.stream().reduce(0, Integer::sum);
        return sum;
    }

    // Compare the Triplets
    // The task is to find their comparison points by comparing
    // a[0] with b[0], a[1] with b[1], and a[2] with b[2].
    // If a[i] > b[i], then Alice is awarded 1 point.
    // If a[i] < b[i], then Bob is awarded 1 point.
    // If a[i] = b[i], then neither person receives a point.
    // Comparison points is the total points a person earned.
    // Given a and b, determine their respective comparison points.
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] comparative = {0, 0};
//        List<Integer> comparative = new ArrayList<Integer>();
//        comparative.add(0, 0);
//        comparative.add(1, 0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                comparative[0] = comparative[0] + 1;
            } else if (b.get(i) > a.get(i)) {
                comparative[1] = comparative[1] + 1;
            }
        }
//        return List.of(comparative);
        return Arrays.asList(comparative);
    }

    //    A Very Big Sum
//    return the sum of all array elements
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum = sum + ar.get(i);
        }
        return sum;
    }

    //    Diagonal Difference
//    Given a square matrix, calculate the absolute difference
//    between the sums of its diagonals
    public static int diagonalDifference(List<List<Integer>> arr) {
        int forward = 0;
        int backward = 0;
        int arrIndexSize = arr.get(0).get(0);
        for (int i = 0; i < arr.get(0).get(0); i++) {
            forward = forward + arr.get(i).get(i + 1);
            backward = backward + arr.get(arrIndexSize - 1).get(i + 1);
//            forward = forward + arr.get(i+1).get(i);
//            backward = backward + arr.get(i+1).get(arrIndexSize-1);
            arrIndexSize--;
        }
        return Math.abs(forward - backward); // not right yet
//        return 1;

    }

}
