package com.nitka.tests;

import com.nitka.first.FirstNumberList;
import com.nitka.NumberList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by antonkw on 23.06.2015.
 */
public class FirstTest {
    @Test
    public void test1() {
        NumberList list = new FirstNumberList();
        list.addNumber(1);
        list.addNumber(1);
        list.addNumber(1);
        list.addNumber(3);
        list.addNumber(2);
        list.addNumber(2);
        list.addNumber(2);
        list.checkGroups();
        assertEquals(1, list.getNumberList().size());
        assertEquals(3, list.getNumberList().get(0).intValue());
    }

    @Test
    public void test2() {
        FirstNumberList list = new FirstNumberList();
        list.addNumber(2);
        list.addNumber(1);
        list.addNumber(1);
        list.addNumber(1);
        list.addNumber(1);
        list.addNumber(2);
        list.addNumber(2);
        list.checkGroups();
        assertEquals(3, list.getNumberList().size());
        assertEquals(2, list.getNumberList().get(0).intValue());
        assertEquals(2, list.getNumberList().get(2).intValue());
    }
}
