package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                result.addLast(number);
            } else {
                result.addFirst(number);
            }
        }
        System.out.println(result);
        return result;
    }
}
