package com.nitka.second;

import com.nitka.first.AbstractNumberList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by antonkw on 23.06.2015.
 */
public class SecondNumberList extends AbstractNumberList {
    private int[] numbersCounters = new int[10];

    public void clear() {
        numberList = new LinkedList<Integer>();
    }

    public SecondNumberList() {
        numberList = new LinkedList<Integer>();
    }

    public void checkGroups() {
        ListIterator<Integer> listIterator = numberList.listIterator();
        for (int i = 0; i < 10; i++) {
            numbersCounters[i] = 0;
        }
        while (listIterator.hasNext()) {
            numbersCounters[listIterator.next()]++;
        }
        for (int position = 0; position < numberList.size(); position++) {
            if (numbersCounters[numberList.get(position)] >= 3) {
                numberList.remove(position);
                --position;
            }
        }
    }


}
