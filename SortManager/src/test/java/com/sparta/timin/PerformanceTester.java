package com.sparta.timin;

import com.sparta.timin.sorters.*;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PerformanceTester {


    private final int arrayLength = 12;

    int[] performanceSetup () {

        Random random = new Random();
        int[] arrayToSort = new int[arrayLength];
        for (int i=0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(1000) ;
        }return arrayToSort;
    }

    @Test
    void bubbleSpeed() {
        long start = System.nanoTime();
        BubbleSorter.bubbleSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println("Bubble sort speed in milliseconds: " );
        System.out.println(time);
    }

    @Test
    void insertionSpeed() {
        long start = System.nanoTime();
        InsertionSorter.insertionSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println("Insertion sort speed in milliseconds: " );
        System.out.println(time);
    }

    @Test
    void quickSpeed() {
        long start = System.nanoTime();
        QuickSorter.quickSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println("Quick sort speed in milliseconds: " );
        System.out.println(time);
    }

    @Test
    void selectionSpeed() {
        long start = System.nanoTime();
        SelectionSorter.selectionSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println("Selection sort speed in milliseconds: " );
        System.out.println(time);
    }

    @Test
    void binarySpeed() {
        long start = System.nanoTime();
        BinarySorter.binarySort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println("Binary sort speed in milliseconds: " );
        System.out.println(time);
    }

    @Test
    void mergeSpeed() {
        long start = System.nanoTime();
        MergeSorter.mergeSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000;
        System.out.println("Merge sort speed in milliseconds: " );
        System.out.println(time);
    }

    @Test
    void bogoSpeed() {
        long start = System.nanoTime();
        BogoSorter.bogoSort(performanceSetup());
        long finish = System.nanoTime();
        long time = (finish-start)/1_000_000_000;
        System.out.println("Bogo sort speed in seconds: " );
        System.out.println(time);
    }


}
