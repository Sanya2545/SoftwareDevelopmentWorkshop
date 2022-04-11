package com.company;

import java.util.Scanner;

public class Main {

    public static void ShowArray(int arr[][], int size)
    {
        for(int i = 0; i < size; ++i)
        {
            for(int j = 0; j < size; ++j)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
	// write your code here
        int range1 = 0;
        int range2 = 100;
        System.out.println("Enter a size of arrays : ");
        Scanner scanner = new Scanner(System.in);
        int  size = scanner.nextInt();
        int arr [][] = new int[size][size];
        System.out.println("Filling array by random numbers ...");
        for(int i = 0; i < size; ++i)
        {
            for(int j = 0; j < size; ++j)
            {
                arr[i][j] = range1 + (int) (Math.random() * range2);
            }
        }
        ShowArray(arr, size);

        System.out.println("Meshing up columns ...");
        int h = 0;
        for(int i = 0; i < size; ++i)
        {

            for(int j = size-1; j > 0 && h < size; --j, ++h)
            {
                //Replacing items from last to first
                int temp = arr[i][j];
                arr[i][j] = arr[i][h];
                arr[i][h] = temp;
                continue;
            }
        }
        ShowArray(arr, size);
    }
}
