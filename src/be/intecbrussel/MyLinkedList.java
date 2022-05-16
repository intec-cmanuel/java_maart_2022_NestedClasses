package be.intecbrussel;

public class MyLinkedList {
    private Node firstNode;

    public void add(int value) {
        Node newNode = new Node(value);

        if (firstNode == null) {
            firstNode = newNode;
            return;
        }

        Node nodeToCheck = firstNode;
        while (nodeToCheck.nextNode != null) {
            nodeToCheck = nodeToCheck.nextNode;
        }

        nodeToCheck.nextNode = newNode;

    }

    private class Node {
        public Node nextNode;
        public int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
