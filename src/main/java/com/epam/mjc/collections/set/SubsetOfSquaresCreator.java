package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        NavigableSet<Integer> integers = new TreeSet<>();

        for (Integer i: sourceList) {

            Integer square = (int) Math.pow(i,2);

            if (square < lowerBound || square > upperBound)
                continue;

            integers.add(square);
        }

        return integers;
    }
}
