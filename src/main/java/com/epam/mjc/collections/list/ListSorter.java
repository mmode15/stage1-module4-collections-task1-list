package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Comparator<String> comparator = new ListComparator();
        Collections.sort(sourceList, comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int resultA = 5 * intA * intA + 3;
        int resultB = 5 * intB * intB + 3;

        if (resultA < resultB) {
            return -1;
        } else if (resultA > resultB) {
            return 1;
        } else {
            return Integer.compare(intA, intB);
        }
    }
}
