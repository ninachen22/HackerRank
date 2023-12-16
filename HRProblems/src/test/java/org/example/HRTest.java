package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.example.Main.*;

public class HRTest {
    @Test
    public void simpleArraySumTest1() {
        Integer[] nums = {1, 2, 3};
        Integer expected = 6;
        Integer actual = simpleArraySum(List.of(nums));
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void compareTripsTest() {
        Integer[] a = {5, 6, 7};
        Integer[] b = {3, 6, 10};
        Integer[] expected = {1, 1};
        Integer[] actual = compareTriplets(Arrays.asList(a), Arrays.asList(b)).toArray(new Integer[0]);
    }

    @Test
    public void diagDiffTest1() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(3));
        matrix.add(List.of(11,2,4));
        matrix.add(List.of(4,5,6));
        matrix.add(List.of(10,8,-12));
        int expected = 15;
        int actual = diagonalDifference(matrix);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void subArrTotalTest() {
        List<Integer> arr = new ArrayList<>();
        arr.add(0, 3);
        arr.add(1, 1);
        arr.add(2, 2);
        arr.add(3, 3);
        long expected = 20;
        long actual = subarraySum(arr);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

}
