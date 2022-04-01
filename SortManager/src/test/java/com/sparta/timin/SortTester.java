package com.sparta.timin;

import com.sparta.timin.sorters.MergeSorter;
import com.sparta.timin.sorters.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTester {

    @Test
    void bubbleTest() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, BubbleSorter.bubbleSort(new int[]{3, 2, 1}));
    }

    @Test
    void sortCheckerTrue() {
        Assertions.assertTrue(SortChecker.isSorted(new int[]{1, 2, 2}));
    }

    @Test
    void sortCheckerFalse() {
        Assertions.assertFalse(SortChecker.isSorted(new int[]{3, 2, 2}));
    }

    @Test
    void insertionTest() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, InsertionSorter.insertionSort(new int[]{3, 2, 1}));
    }

    @Test
    void selectionTest() {
        Assertions.assertArrayEquals(new int[] {1,2,3}, SelectionSorter.selectionSort(new int[]{3,2,1}));
    }

    @Test
    void binaryTest() {
        Assertions.assertArrayEquals(new int[] {1, 1, 2, 3, 4, 5}, BinarySorter.binarySort(new int[]{3, 2, 1, 5, 1, 4}));
    }

    @Test
    void mergeTest() {
        Assertions.assertArrayEquals(new int[] {1,2,3,4,5,6}, MergeSorter.mergeSort(new int[] {6,4,3,5,2,1,}));
    }

    @Test
    void quickTest() {
        Assertions.assertArrayEquals(new int[] {1,2,3,4,5,6}, QuickSorter.quickSort(new int[] {6,4,3,5,2,1,}));
    }

    @Test
    void quickDuplicate() {
        Assertions.assertArrayEquals(new int[] {5,6,6,6,6,6}, QuickSorter.quickSort(new int[] {6,6,6,6,6,5}));
    }

    @Test
    void bogoTest() {
        Assertions.assertArrayEquals(new int[] {-1, 1,2,3,4,5,6, 8, 10, 18}, BogoSorter.bogoSort(new int[] {-1, 6,4,3,5,2,1,8,18, 10}));
    }


}
