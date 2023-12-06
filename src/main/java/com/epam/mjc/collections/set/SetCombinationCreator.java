package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> strings = new HashSet<>();

        strings.addAll(firstSet);
        strings.retainAll(secondSet);
        strings.removeAll(thirdSet);

        Set<String> temp = new HashSet<>();
        temp.addAll(thirdSet);
        temp.removeAll(firstSet);
        temp.removeAll(secondSet);

        strings.addAll(temp);

        return strings;
    }
}
