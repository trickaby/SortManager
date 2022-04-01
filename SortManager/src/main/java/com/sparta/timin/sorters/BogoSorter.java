package com.sparta.timin.sorters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BogoSorter implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return bogoSort(arrayToSort);
    }

    public static int[] bogoSort(int[] arrayToSort) {
        int count =0;
        List<Integer> list = Arrays.stream(arrayToSort)
                .boxed()
                .collect(Collectors.toList());
        while(!SortChecker.isSorted(arrayToSort)) {
            count++;
            Collections.shuffle(list);
            arrayToSort = list.stream().mapToInt(i->i).toArray();
        }
        System.out.println("Number of attempts taken:");
        System.out.format("%,d%n", count);
        return arrayToSort;
    }


}
