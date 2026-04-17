package org.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void baseCase() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        App.merge(nums1, nums2, 3, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void nums2Smaller() {
        int[] nums1 = {5, 6, 7, 0, 0, 0};
        int[] nums2 = {1, 2, 3};

        App.merge(nums1, nums2, 3, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 5, 6, 7}, nums1);
    }

    @Test
    public void nums1Smaller() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};

        App.merge(nums1, nums2, 3, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void nums2Empty() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};

        App.merge(nums1, nums2, 0, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    public void nums1Empty() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};

        App.merge(nums1, nums2, 3, 0);

        Assert.assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    public void duplicates() {
        int[] nums1 = {1, 2, 2, 0, 0, 0};
        int[] nums2 = {2, 2, 3};

        App.merge(nums1, nums2, 3, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 2, 2, 2, 3}, nums1);
    }

    @Test
    public void singleElement() {
        int[] nums1 = {1, 0};
        int[] nums2 = {2};

        App.merge(nums1, nums2, 1, 1);

        Assert.assertArrayEquals(new int[]{1, 2}, nums1);
    }

    @Test
    public void allZerosEdgeCase() {
        int[] nums1 = {0};
        int[] nums2 = {1};

        App.merge(nums1, nums2, 1, 0);

        Assert.assertArrayEquals(new int[]{1}, nums1);
    }
}