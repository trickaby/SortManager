package com.sparta.timin.sorters;

import com.sparta.timin.binaryTree.BinaryTree;

import java.util.Arrays;

public class BinarySorter implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return binarySort(arrayToSort);
    }

//    public static int[] binarySort(int[] arrayToSort) {
//        return
//    }

    public static int[] binarySort(int[] arrayToSort) {
        BinaryTree binaryTree = new BinaryTree(arrayToSort);
        return binaryTree.getSortedTreeAsc();
    }
}
