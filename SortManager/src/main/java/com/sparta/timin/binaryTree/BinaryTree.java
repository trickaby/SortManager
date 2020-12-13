package com.sparta.timin.binaryTree;

import java.util.Arrays;

public class BinaryTree implements BinaryTreeInterface {
    private final Node rootNode;
    private int numberOfElements;
    int count;
    int[] sortedTree;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
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
        for (int i=0; i< elements.length;i++ ) {
            addElement(elements[i]);
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
        if(rootNode.isRightChildEmpty()) {
            throw new ChildNotFoundException();
        } return rootNode.getLeftChild().getValue();
    }



    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if(rootNode.isLeftChildEmpty()) {
            throw new ChildNotFoundException();
        } return rootNode.getRightChild().getValue();
    }

    @Override
    public int[] getSortedTreeAsc() {
        sortedTree = new int[numberOfElements];
        count = 0;
        sortTreeAsc(rootNode);
        return sortedTree;
    }

    private void sortTreeAsc(Node node) {
        if (!node.isLeftChildEmpty()) {
            sortTreeAsc(node.getLeftChild());
        }
        sortedTree[count] = node.getValue();
        count++;
        if (!node.isRightChildEmpty()) {
            sortTreeAsc(node.getRightChild());
        }
    }


    @Override
    public int[] getSortedTreeDesc() {
        sortedTree = new int[numberOfElements];
        count = 0;
        sortTreeDesc(rootNode);
        return sortedTree;
    }


    private void sortTreeDesc(Node node) {
        if (!node.isRightChildEmpty()) {
            sortTreeDesc(node.getRightChild());
        }
        sortedTree[count] = node.getValue();
        count++;
        if (!node.isLeftChildEmpty()) {
            sortTreeDesc(node.getLeftChild());
        }
    }

    private void addNodeToTree(Node node, int element) {
        if (element == node.getValue()) return;

        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }

        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
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
