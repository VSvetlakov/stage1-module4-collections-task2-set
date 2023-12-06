package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer i: sourceList) {

            if (i%2==0){
                addDiv2Element(hashSet, i);
            }else {
                hashSet.add(i);
                hashSet.add(i*2);
            }
        }
        return hashSet;
    }

    private void addDiv2Element(HashSet<Integer> hashSet, Integer i){

        hashSet.add(i);

        if (i%2==0){
            addDiv2Element(hashSet, i / 2);
        }
    }
}
