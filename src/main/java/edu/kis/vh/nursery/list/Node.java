package edu.kis.vh.nursery.list;

public class Node {
    /**
     * protected Node prev - poprzedni Node listy
     * protected Node next - następny Node listy
     * private final int value - wartość, którą przechowuje dany Node
     * public Node(int i) - kontruktor Noda, który odrazu go inicjalizuje
     * public int getValue() - zwraca wartość, którą przechoowuje Node
     */
    final private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }
    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
