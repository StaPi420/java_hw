package main.java;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class App
{
    public void doubleZeros(ArrayList<int> ar){
        Stack<int> stack = new Stack<>();
        while (!ar.isEmpty()){
            stack.push(ar.removeLast());
        }
        while (!stack.isEmpty()){
            int cur = stack.pop();
            if (cur == 0){
                ar.add(0);
            }
            ar.add(0)
        }
    }
    public void PrintArray(Array<T> ar){
        for (T elem : ar){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    public static void main( String[] args )
    {
        ArrayList<int> ar = new ArrayList<int>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i){
            int elem = scanner.nextInt();
            ar.add(elem);
        }
        doubleZeros(ar);
        PrintArray(ar);
    }
}
