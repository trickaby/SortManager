package com.sparta.timin;

import com.sparta.timin.binaryTree.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import com.sparta.timin.binaryTree.BinaryTree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryTest {

    @Test
    void addElementTest() throws ChildNotFoundException {
        BinaryTree binaryTree = new BinaryTree(new int[]{1, 1, 2, 3, 4, 5});
        binaryTree.addElement(2);
        Assertions.assertEquals(7, binaryTree.getNumberOfElements());
        Assertions.assertEquals(1, binaryTree.getRootElement());
        Assertions.assertTrue(binaryTree.findElement(5));
        Assertions.assertFalse(binaryTree.findElement(6));
        Assertions.assertEquals(2, binaryTree.getLeftChild(2));
        Assertions.assertEquals(4, binaryTree.getRightChild(3));
    }

    @Test
    void addElementsTest() {
        BinaryTree binaryTree = new BinaryTree(new int[]{1, 1, 2, 3, 4, 5});
        binaryTree.addElements(new int[]{2, 2, 4, 6, 7});
        Assertions.assertEquals(11, binaryTree.getNumberOfElements());

    }

    @Test
    void rootTest() {
        BinaryTree binaryTree = new BinaryTree(new int[]{1, 1, 2, 3, 4, 5});
        Assertions.assertEquals(1, binaryTree.getRootElement());
    }

    @Test
    void leftChildNotFoundTest() {
        BinaryTree binaryTree = new BinaryTree(new int[]{1, 2, 3});
        int element = 1;
        try {
            binaryTree.getLeftChild(element);
            Assertions.fail();
        } catch (ChildNotFoundException childNotFoundException) {
            Assertions.assertEquals("Left child not found!", childNotFoundException.getMessage());
        }
    }

    @Test
    void rightChildNotFoundTest() {
        BinaryTree binaryTree = new BinaryTree(new int[]{1, 2, 3});
        int element = 1;
        try {
            Assertions.assertEquals(2, binaryTree.getRightChild(element));
        } catch (ChildNotFoundException childNotFoundException) {
            System.out.println(childNotFoundException.getMessage());
            Assertions.fail();
        }
    }

    @Test
    void sortAscTest() {
        BinaryTree binaryTree = new BinaryTree(new int[]{3, 2, 1, 5, 1, 4});
        Assertions.assertEquals("[1, 1, 2, 3, 4, 5]", Arrays.toString(binaryTree.getSortedTreeAsc()));
    }

    @Test
    void sortDescTest() {
        BinaryTree binaryTree = new BinaryTree(new int[]{3, 2, 1, 5, 1, 4});
        Assertions.assertEquals("[5, 4, 3, 2, 1, 1]", Arrays.toString(binaryTree.getSortedTreeDesc()));
    }





}
