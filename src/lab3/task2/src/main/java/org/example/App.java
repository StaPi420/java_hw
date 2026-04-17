package org.example;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void merge(int[] nums1, int[] nums2, int n, int m){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    public static <E> void PrintArray(int[] ar){
        for (int elem : ar){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main( String[] args )
    {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        App.merge(nums1, nums2, 3, 3);

        PrintArray(nums1);
    }
}
