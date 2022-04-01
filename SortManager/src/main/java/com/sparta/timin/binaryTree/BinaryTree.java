package com.sparta.timin.binaryTree;

import java.util.Arrays;

public class BinaryTree implements BinaryTreeInterface {
    private final Node rootNode;
    private int numberOfElements;
    private int count = 0;
    int[] sortedTreeAsc;
    int[] sortedTreeDesc;

    public BinaryTree(int[] arrayToSort) {
        rootNode = new Node(arrayToSort[0]);
        numberOfElements = 1;
        int[] restOfArray = Arrays.copyOfRange(arrayToSort, 1, arrayToSort.length);
        addElements(restOfArray);
        sortTreeAsc();
        sortTreeDesc();
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    @Override
    public boolean findElement(int value) {
        return findNode(value) != null;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (findNode(element).getLeftChild() == null) {
            throw new ChildNotFoundException("Left child not found!");
        } else {
            return findNode(element).getLeftChild().getValue();
        }
    }



    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if(findNode(element).getRightChild() != null) {
            return findNode(element).getRightChild().getValue();
        } else throw new ChildNotFoundException("Right Child not found!");

    }

    @Override
    public int[] getSortedTreeAsc() {
        return sortedTreeAsc;
    }

    private void sortTreeAsc() {
        sortedTreeAsc = new int[numberOfElements];
        count = 0;
        addElementsToSortedTreeAsc(rootNode);
    }

    private void addElementsToSortedTreeAsc(Node node) {
        if(!node.isLeftChildEmpty()) {
            addElementsToSortedTreeAsc(node.getLeftChild());
        }
        sortedTreeAsc[count] = node.getValue();
        count++;
        if(!node.isRightChildEmpty()) {
            addElementsToSortedTreeAsc(node.getRightChild());
        }
    }


    @Override
    public int[] getSortedTreeDesc() {
        return sortedTreeDesc;
    }


    private void sortTreeDesc() {
        sortedTreeDesc = new int[numberOfElements];
        count = 0;
        addElementsToSortedTreeDesc(rootNode);

    }

    private void addElementsToSortedTreeDesc(Node node) {
        if (!node.isRightChildEmpty()) {
            addElementsToSortedTreeDesc(node.getRightChild());
        }
        sortedTreeDesc[count] = node.getValue();
        count++;
        if (!node.isLeftChildEmpty()) {
            addElementsToSortedTreeDesc(node.getLeftChild());
        }
    }

    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                numberOfElements++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }

        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
                numberOfElements++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }


    public Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if(element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }






}
