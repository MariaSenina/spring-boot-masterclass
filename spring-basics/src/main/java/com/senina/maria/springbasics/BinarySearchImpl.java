package com.senina.maria.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;
    // NOTE: @Primary has higher priority when compared to Autowiring by name.

    public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // Sort an array
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);

        // Search the array

        // Return the result
        return 3;
    }
}
