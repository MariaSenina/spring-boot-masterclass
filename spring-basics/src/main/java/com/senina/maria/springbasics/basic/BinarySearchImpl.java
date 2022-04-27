package com.senina.maria.springbasics.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
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

    public void postConstruct() {
        logger.info("Post-Construct");
    }

    public void preDestroy() {
        logger.info("Pre-Destroy");
    }
}
