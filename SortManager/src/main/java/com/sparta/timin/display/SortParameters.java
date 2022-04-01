package com.sparta.timin.display;

import com.sparta.timin.sorters.Sorter;

public class SortParameters {

    private static int arrayLength;
    private static Sorter sortMethod;
    private static int sortType;

    public static int getSortType() {
        return sortType;
    }

    public static void setSortType(int sortType) {
        SortParameters.sortType = sortType;
    }

    public static int getArrayLength() {
        return arrayLength;
    }

    public static void setArrayLength(int arrayLength) {
        SortParameters.arrayLength = arrayLength;
    }

    public static Sorter getSortMethod() {
        return sortMethod;
    }

    public static void setSortMethod(Sorter sortMethod) {
        SortParameters.sortMethod = sortMethod;
    }
}