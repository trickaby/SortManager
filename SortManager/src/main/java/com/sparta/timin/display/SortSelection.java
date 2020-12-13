package com.sparta.timin.display;

import com.sparta.timin.binaryTree.BinaryTree;
import com.sparta.timin.binaryTree.BinaryTreeInterface;
import com.sparta.timin.sorters.*;

import java.util.Arrays;

public class SortSelection {
    public static void selectSorter(int number, int[] arrayToSort) {
        int[] res = new int[arrayToSort.length];
        long start = System.nanoTime();
        switch(number) {
            case 1:
                System.out.println("Using Bubble sort... ");
                res = BubbleSorter.bubbleSort(arrayToSort);
                break;
            case 2:
                System.out.println("Using Insertion sort... ");
                res = InsertionSorter.insertionSort(arrayToSort);
                break;
            case 3:
                System.out.println("Using Selection sort... ");
                res = SelectionSorter.selectionSort(arrayToSort);
                break;
            case 4:
                System.out.println("Using Quick sort... ");
                res = QuickSorter.quickSort(arrayToSort);
                break;
//            case 5:
//                System.out.println("Using Binary sort: ");
//                res = ;
//                break;
            case 6:
                System.out.println("Using Merge sort... ");
                res = MergeSorter.mergeSort(arrayToSort);
                break;
        }
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(res));
        System.out.println("Time taken in milliseconds:  " + time);

    }
}
