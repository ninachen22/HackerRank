package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.Main.compareTriplets;
import static org.example.Main.simpleArraySum;

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
        Integer[] a = {5,6,7};
        Integer[] b = {3,6,10};
        Integer[] expected = {1,1};
        Integer[] actual = compareTriplets(Arrays.asList(a),Arrays.asList(b)).toArray(new Integer[0]);
    }

}
