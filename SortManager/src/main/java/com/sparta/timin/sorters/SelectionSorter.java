package com.sparta.timin.sorters;

public class SelectionSorter implements Sorter{

    public static int[] selectionSort(int[] arrayToSort) {
        int n = arrayToSort.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (arrayToSort[j] < arrayToSort[minIndex])
                    minIndex = j;

            // Swap the found minimum element with the first
            // element
            int dummy = arrayToSort[minIndex];
            arrayToSort[minIndex] = arrayToSort[i];
            arrayToSort[i] = dummy;
        } return arrayToSort;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return selectionSort(arrayToSort);
    }




}
