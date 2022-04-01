package com.sparta.timin.sorters;

public class BubbleSorter implements Sorter {

    public static int[] bubbleSort(int[] arrayToSort) {
    int n = arrayToSort.length;
    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (arrayToSort[j] > arrayToSort[j + 1]) {
                int dummy = arrayToSort[j];
                arrayToSort[j] = arrayToSort[j + 1];
                arrayToSort[j + 1] = dummy;
            }
    return arrayToSort;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return bubbleSort(arrayToSort);
    }


}



