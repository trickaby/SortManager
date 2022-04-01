package com.sparta.timin.start;

import com.sparta.timin.display.DisplayManager;
import com.sparta.timin.display.SortParameters;
import com.sparta.timin.sorters.Sorter;

public class Starter {

    public static void main(String[] args) {
        DisplayManager.selectSortMethod();
        DisplayManager.selectArrayLength();
        DisplayManager.sortArray(SortParameters.getSortMethod(), SortParameters.getArrayLength());

    }

}
