
package com.mycompany.group5;

public class Stack<T> extends List<T> {
    @Override
    public void add(T value) {
        super.add_front(value);
    }
    @Override
    public String toString() {
        String out;
        out = "Stack";
        for (Node<T> i = this.getHead(); i != null; i = i.getNext()) {
            out += i.getValue().toString() + " ";
        }
        return out;
    }
}
