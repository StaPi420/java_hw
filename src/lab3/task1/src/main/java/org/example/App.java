package org.example;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class App
{
    public static void doubleZeros(int[] ar){
        Stack<Integer> stack = new Stack<>();
        int len = ar.length;
        for (int i = len - 1; i >= 0; --i) {
            stack.push(ar[i]);
        }
        for (int i = 0; i < len; ++i){
            int elem = stack.pop();
            ar[i] = elem;
            if (elem == 0){
                if (i < len - 1){
                    ++i;
                    ar[i] = 0;
                }
                else {
                    return;
                }
            }
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; ++i){
            ar[i] = scanner.nextInt();
        }
        doubleZeros(ar);
        PrintArray(ar);
    }
}
