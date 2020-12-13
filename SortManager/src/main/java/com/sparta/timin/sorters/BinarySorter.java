package com.sparta.timin.sorters;

import com.sparta.timin.binaryTree.BinaryTree;

import java.util.Arrays;

public class BinarySorter implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree BinaryTree = new BinaryTree(arrayToSort[0]);
        BinaryTree.addElements(Arrays.copyOfRange(arrayToSort, 1, arrayToSort.length));
        return BinaryTree.getSortedTreeAsc();
    }

//    public static int[] binarySort(int[] arrayToSort) {
//        return
//    }

    private static int[] binarySort(int[] arrayToSort) {
        BinaryTree BinaryTree = new BinaryTree(arrayToSort[0]);
        int[] restOfArray = Arrays.copyOfRange(arrayToSort, 1, arrayToSort.length);
        BinaryTree.addElements(restOfArray);
        return BinaryTree.getSortedTreeAsc();
    }
}
