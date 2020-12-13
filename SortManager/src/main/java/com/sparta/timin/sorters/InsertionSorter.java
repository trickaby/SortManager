package com.sparta.timin.sorters;

public class InsertionSorter implements Sorter {

    public static int[] insertionSort(int arrayToSort[]){
        int n = arrayToSort.length;
        for (int i = 1; i < n; ++i) {
            int elementToPlace = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > elementToPlace) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = elementToPlace;
        } return arrayToSort;
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {
        insertionSort(arrayToSort);
        return arrayToSort;
    }
}
