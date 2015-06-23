package com.nitka.tests;

import com.nitka.NumberList;
import com.nitka.second.SecondNumberList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by antonkw on 23.06.2015.
 */
public class SecondTest {
    @Test
    public void test1() {
        NumberList list = new SecondNumberList();
        list.addNumber(2);
        list.addNumber(1);
        list.addNumber(2);
        list.addNumber(3);
        list.addNumber(2);
        list.addNumber(2);
        list.addNumber(2);
        list.checkGroups();
        assertEquals(2, list.getNumberList().size());
        assertEquals(1, list.getNumberList().get(0).intValue());
        assertEquals(3, list.getNumberList().get(1).intValue());
    }
    @Test
    public void test2() {
        NumberList list = new SecondNumberList();
        list.addNumber(1);
        list.addNumber(2);
        list.addNumber(3);
        list.addNumber(1);
        list.addNumber(2);
        list.addNumber(3);
        list.addNumber(0);
        list.checkGroups();
        assertEquals(7, list.getNumberList().size());
        list.clear();
        list.addNumber(0);
        list.addNumber(0);
        list.addNumber(0);
        list.checkGroups();
        assertEquals(0, list.getNumberList().size());
        //assertEquals(1, list.getNumberList().get(0).intValue());

    }

    @Test
    public void test3() {
        NumberList list = new SecondNumberList();
        list.addNumber(2);
        list.addNumber(2);
        list.addNumber(7);
        list.addNumber(2);
        list.addNumber(7);
        list.addNumber(7);
        list.addNumber(7);
        list.checkGroups();
        assertEquals(0, list.getNumberList().size());
    }
}
