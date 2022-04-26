package com.senina.maria.springbasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        // Quick Sort logic...

        return numbers;
    }
}
