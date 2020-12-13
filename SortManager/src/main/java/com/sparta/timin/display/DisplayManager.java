package com.sparta.timin.display;

import com.sparta.timin.sorters.MergeSorter;
import com.sparta.timin.sorters.BubbleSorter;
import com.sparta.timin.sorters.InsertionSorter;
import com.sparta.timin.sorters.QuickSorter;
import com.sparta.timin.sorters.SelectionSorter;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DisplayManager {

        public static int enterDetails() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of sort: ");
            System.out.println("1: bubble sort");
            System.out.println("2: insertion sort");
            System.out.println("3: selection sort");
            System.out.println("4: quick sort");
            System.out.println("5: binary tree sort");
            System.out.println("6: merge sort");
            int number = scanner.nextInt();
//            if(number == 1 || number == 2 ||number == 3 ||number == 4 ||number == 5 ||number == 6) {
//                throw new IllegalArgumentException("Please enter a valid number");
//            }
            return number;
        }

        public static int[] enterArray() {
            System.out.println("Enter the size of array: ");
            Scanner scanner = new Scanner(System.in);
            int arraySize = scanner.nextInt();
            int[] arrayToSort = new int[arraySize];
            Random random = new Random();
            for (int i=0; i < arraySize; i++) {
                arrayToSort[i] = random.nextInt(100) ;
            }
            System.out.println("Unsorted array is: ");
            System.out.println(Arrays.toString(arrayToSort));
            return arrayToSort;

        }




}
