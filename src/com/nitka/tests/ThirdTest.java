package com.nitka.tests;

import com.nitka.first.Node;
import com.nitka.first.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by antonkw on 24.06.2015.
 */
public class ThirdTest {
    @Test
    public void test1() {
        Tree testTree = new Tree();
        Node testNode0 = new Node(5);
        testTree.insert(testNode0, 2);
        testTree.insert(testNode0, 1);
        testTree.insert(testNode0, 3);
        testTree.insert(testNode0, 8);
        testTree.insert(testNode0, 6);
        testTree.insert(testNode0, 10);
        testTree.insert(testNode0, 9);
        assertEquals(4, testTree.height(testNode0));
    }
}
