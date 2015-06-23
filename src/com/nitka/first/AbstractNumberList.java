package com.nitka.first;

import com.nitka.NumberList;

import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by antonkw on 24.06.2015.
 */
public class AbstractNumberList implements NumberList {
    protected List<Integer> numberList = null;

    public void addNumber(Integer number) throws InputMismatchException {
        if (number < 0 || number > 9)
            throw new InputMismatchException("you must input int numbers from 0 to 9!");
        numberList.add(number);
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void checkGroups() {};

    public void clear() {};
}
