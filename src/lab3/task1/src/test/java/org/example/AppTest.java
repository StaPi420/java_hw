package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.example.App;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void BaseTestCase(){
        int[] ar = {1, 0, 4, 0};
        int[] res = {1, 0, 0, 4};

        App.doubleZeros(ar);

        Assert.assertArrayEquals(ar, res);
    }

    @Test
    public void OnlyZerosTest(){
        int[] ar = {0, 0};
        int[] res = {0, 0};

        App.doubleZeros(ar);

        Assert.assertArrayEquals(ar, res);
    }

    @Test
    public void NoZerosTest(){
        int[] ar = {1, 2, 3, 4};
        int[] res = {1, 2, 3, 4};

        App.doubleZeros(ar);

        Assert.assertArrayEquals(ar, res);
    }

    @Test
    public void EndsWithZero(){
        int[] ar = {1, 5, 4, 0};
        int[] res = {1, 5, 4, 0};

        App.doubleZeros(ar);

        Assert.assertArrayEquals(ar, res);
    }
}
