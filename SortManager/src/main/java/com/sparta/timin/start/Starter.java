package com.sparta.timin.start;

import com.sparta.timin.display.DisplayManager;
import com.sparta.timin.display.SortSelection;

public class Starter {

    public static void main(String[] args) {


        SortSelection.selectSorter(DisplayManager.enterDetails(), DisplayManager.enterArray());
    }

}
