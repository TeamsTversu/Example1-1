
package com.mycompany.group5;


class Node<T> {
    
    private T value;
    private Node<T> next;
    private final List<T> outer;

    Node(T value, Node<T> next, final List<T> outer) {
        this.outer = outer;
        this.value = value;
        this.next = next;
    }

    Node(T value, final List<T> outer) {
        this.outer = outer;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return getValue() + "";
    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @return the next
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
    
}
