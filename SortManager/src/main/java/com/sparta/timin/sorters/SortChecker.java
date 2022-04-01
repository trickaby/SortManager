package com.sparta.timin.sorters;

public class SortChecker {

    public static boolean isSorted(int[] arrayToCheck) {
        for (int i = 0, j = 1; j < arrayToCheck.length && i < j; i++, j++ ){
            if (arrayToCheck[i] > arrayToCheck[j]) {
                return false;
            }
        } return true;
    }
}
