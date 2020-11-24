
package com.mycompany.group5;
  


public class List<T> {

    
    private Node<T> head;
    private int size;
    private Node<T> currentNode;
    
    public List() {
        head = null;
        size = 0;
        currentNode = head;
    }
    public int getSize() {
        return size;
    }
    public T elementAt() {
        T info = getCurrentNode().getValue();
        if (getCurrentNode().getNext() != null) {
            setCurrentNode(getCurrentNode().getNext());
        }
        return info;
    }
    @SuppressWarnings("empty-statement")
    public T getIndex(int index) {
        Node<T> cur = getHead();
        for (int i = 0; cur != null && i < index; i++, cur = cur.getNext());
        return cur.getValue(); 
    }

    public void add(T value) {
        Node<T> nodeToAdd = new Node<>(value, this);
        if (getHead() == null) { setHead(nodeToAdd); setCurrentNode(getHead()); }
        else {
            Node<T> cur = getHead();
            while(cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(nodeToAdd);
            setCurrentNode(nodeToAdd);
        }
        setSize(getSize() + 1);
    }
    
    public void add_front(T value) {
        Node<T> nodeToAdd = new Node<>(value, this);
        if (getHead() == null) { setHead(nodeToAdd); setCurrentNode(getHead()); }
        else {
            nodeToAdd.setNext(getHead());
            setHead(nodeToAdd);
        }
        
        setSize(getSize() + 1);
    }
    
    public T pop() {
        T value = getHead().getValue();
        setHead(getHead().getNext());
        return value;
    } 

    @Override
    public String toString() {
        String out = "List";
        for (Node<T> i = this.getHead(); i != null; i = i.getNext()) {
            out += i + " ";
        }
        return out;
    }

    /**
     * @return the head
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the currentNode
     */
    public Node<T> getCurrentNode() {
        return currentNode;
    }

    /**
     * @param currentNode the currentNode to set
     */
    public void setCurrentNode(Node<T> currentNode) {
        this.currentNode = currentNode;
    }
}
