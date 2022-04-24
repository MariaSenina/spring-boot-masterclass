package com.senina.maria.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
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
