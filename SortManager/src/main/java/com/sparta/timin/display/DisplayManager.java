package com.sparta.timin.display;

import com.sparta.timin.sorters.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DisplayManager {


    public static void selectSortMethod() {
        promptForSortType();
        int sortType = getSortType();
        SortParameters.setSortMethod(getSortMethod(sortType));
    }

    private static void promptForSortType() {
        System.out.println("Enter a number between 1 and 6 to select the sort type: ");
        System.out.println("1: bubble sort");
        System.out.println("2: insertion sort");
        System.out.println("3: selection sort");
        System.out.println("4: quick sort");
        System.out.println("5: binary tree sort");
        System.out.println("6: merge sort");
    }

    private static int getSortType() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a number");
            while (!scanner.hasNextInt()) {
                System.out.println("An integer is required");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0 || number >6);
        return number;
    }

    private static Sorter getSortMethod(int sortType) {
        switch (sortType) {
            case 1:
                System.out.println("Using bubble sort");
                return new BubbleSorter();
            case 2:
                System.out.println("Using insertion sort");
                return new InsertionSorter();
            case 3:
                System.out.println("Using selection sort");
                return new SelectionSorter();
            case 4:
                System.out.println("Using quick sort");
                return new QuickSorter();
            case 5:
                System.out.println("Using binary sort");
                return new BinarySorter();
            case 6:
                System.out.println("Using merge sort");
                return new MergeSorter();
            default:
                System.out.println("You have elected the way of pain");
                return new BogoSorter();
        }
    }


    public static void selectArrayLength() {
        int arrayLength;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Pleae try again");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);
        SortParameters.setArrayLength(arrayLength);
    }

    public static void sortArray(Sorter sorter, int arrayLength) {
        int[] arrayToSort = createRandomArray(arrayLength);
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        long finish = System.nanoTime();
        publishResults(sortedArray, start, finish);
    }

    public static int[] createRandomArray(int arraySize) {
        int[] arrayToSort = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            arrayToSort[i] = random.nextInt(100);
        }
        System.out.println("Unsorted array is: ");
        System.out.println(Arrays.toString(arrayToSort));
        return arrayToSort;

    }

    private static void publishResults(int[] sortedArray, long start, long finish) {
        long time = (finish-start)/1_000_000;
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time taken to sort in milliseconds:  " + time);
    }
}
