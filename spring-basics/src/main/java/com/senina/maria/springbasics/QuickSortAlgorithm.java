package com.senina.maria.springbasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
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
