package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    @Test
    public void diagDiffTest1() {
        List<Integer> toAdd = new ArrayList<>();
        toAdd.add(0, 11);
        toAdd.add(1,2);
        toAdd.add(2,4);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(0, Collections.singletonList(new Integer(0)));
        matrix.add(1, toAdd);
        System.out.println(matrix);
        System.out.println(matrix.get(1).get(1));
    }

}
