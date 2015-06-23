package com.nitka;

import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by antonkw on 23.06.2015.
 */
public interface NumberList {
    public void addNumber(Integer number) throws InputMismatchException;

    public void checkGroups();

    public void clear();

    public List <Integer> getNumberList();
}
