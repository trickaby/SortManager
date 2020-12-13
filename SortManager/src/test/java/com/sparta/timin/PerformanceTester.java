package com.sparta.timin;

import com.sparta.timin.sorters.MergeSorter;
import com.sparta.timin.sorters.BubbleSorter;
import com.sparta.timin.sorters.InsertionSorter;
import com.sparta.timin.sorters.QuickSorter;
import com.sparta.timin.sorters.SelectionSorter;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTester {




    int[] performanceSetup () {

        Random random = new Random();
        int[] arrayToSort = new int[10000];
        for (int i=0; i < 100; i++) {
            arrayToSort[i] = random.nextInt(10000) ;
        }return arrayToSort;
    }

    @Test
    void bubbleSpeed() {
        System.out.println("Bubble sort speed in milliseconds: " );
        long start = System.nanoTime();
        BubbleSorter.bubbleSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println(time);
    }

    @Test
    void insertionSpeed() {
        System.out.println("Insertion sort speed in milliseconds: " );
        long start = System.nanoTime();
        InsertionSorter.insertionSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println(time);
    }

    @Test
    void quickSpeed() {
        System.out.println("Quick sort speed in milliseconds: " );
        long start = System.nanoTime();
        QuickSorter.quickSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println(time);
    }

    @Test
    void selectionSpeed() {
        System.out.println("Selection sort speed in milliseconds: " );
        long start = System.nanoTime();
        SelectionSorter.selectionSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println(time);
    }

    @Test
    void MergeSpeed() {
        System.out.println("Merge sort speed in milliseconds: " );
        long start = System.nanoTime();
        MergeSorter.mergeSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println(time);
    }



}
