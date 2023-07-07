package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.example.Main.simpleArraySum;

public class HRTest {
    @Test
    public void simpleArraySumTest1() {
        Integer[] nums = {1, 2, 3};
        Integer expected = 6;
        Integer actual = simpleArraySum(List.of(nums));
        Assert.assertEquals(expected, actual);

    }

}
