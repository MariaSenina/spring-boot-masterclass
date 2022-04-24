package com.senina.maria.springbasics;

public class BinarySearchImpl {
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // Sort an array
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        // Search the array

        // Return the result
        return 3;
    }
}
