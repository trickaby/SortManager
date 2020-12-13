package com.sparta.timin.sorters;

import com.sparta.timin.sorters.SortChecker;

import java.util.Arrays;

public class MergeSorter {

    public static int[] mergeSort(int[] arrayToSort) {
        if(SortChecker.isSorted(arrayToSort)) return arrayToSort;
        return merge(mergeSort(Arrays.copyOfRange(arrayToSort,0,(arrayToSort.length+1)/2)), mergeSort(Arrays.copyOfRange(arrayToSort,(arrayToSort.length+1)/2, arrayToSort.length)));
    }


    //merges two SORTED arrays
    public static int[] merge(int[] sortedArray1, int[] sortedArray2) {
        int[] MergedArray;
        MergedArray = new int[sortedArray1.length + sortedArray2.length];

        int i = 0;
        int j = 0;

        while (i < sortedArray1.length && j < sortedArray2.length) {
            if(sortedArray1[i] > sortedArray2[j]) {
                MergedArray[i+j] = sortedArray2[j];
                j++;
            }
            else{
                MergedArray[i+j] = sortedArray1[i];
                i++;
            }
        }

        while (i < sortedArray1.length) {
            MergedArray[i+j] = sortedArray1[i];
            i++;
        }

        while (j < sortedArray2.length) {
            MergedArray[i+j] = sortedArray2[j];
            j++;

        }

        return MergedArray;


    }

}
