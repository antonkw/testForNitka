package com.nitka.first;

import java.util.ArrayList;

/**
 * Created by antonkw on 23.06.2015.
 */
public class FirstNumberList extends AbstractNumberList {
    private Integer counter = null;

    public void clear() {
        numberList = new ArrayList<Integer>();
    }

    public FirstNumberList() {
        counter = 1;
        numberList = new ArrayList<Integer>();
    }

    public void checkGroups() {
        int i = 0;
        while (i < numberList.size()) {
            if (counter >= 3 && !numberList.get(i - 1).equals(numberList.get(i))) {
                i = removeGroup(i);
            }
            if (counter > 1 && !(numberList.get(i - 1).equals(numberList.get(i)))) {
                counter = 1;
            }
            if (i + 1 != numberList.size()) {
                if (numberList.get(i).equals(numberList.get(i + 1))) {
                    ++counter;
                }
            } else if ((numberList.get(i - 1).equals(numberList.get(i))) && counter >= 3) {
                i = removeGroup(i + 1);
            }
            i++;
        }
        counter = 1;
    }

    private Integer removeGroup(Integer position) {
        int deletePosition = position - counter;
        for (int i = 0; i < counter; i++) {
            numberList.remove(deletePosition);
        }
        counter = 1;
        return deletePosition;
    }
}
