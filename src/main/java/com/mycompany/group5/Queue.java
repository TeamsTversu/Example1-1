
package com.mycompany.group5;

public class Queue<T> extends List<T> {
    @Override
    public String toString() {
        String out = "Queue";
        for (Node<T> i = this.getHead(); i != null; i = i.getNext()) {
            out += i.getValue().toString() + " ";
        }
        return out;
    }
}
