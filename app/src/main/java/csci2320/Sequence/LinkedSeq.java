package csci2320.Sequence;

import java.util.Iterator;

public class LinkedSeq<E> implements Seq<E>, Iterable {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int numElems = 0;

    private static class Node<E> {
        public E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public E get(int index) {
        Node<E> rover = head;
        if (index > numElems || index < 0)
            throw new IndexOutOfBoundsException("GET out of bounds at " + index + " of " + numElems);

        for (int i = 0; i < index; i++) {
            rover = rover.next;
        }

        return rover.data;
    }

    @Override
    public int size() {
        return numElems;
    }

    @Override
    public void add(E elem) {
        if (isEmpty())
            head = tail = new Node<E>(elem, null);
        else {
            tail.next = new Node<E>(elem, null);
            tail = tail.next;
        }
        numElems++;
    }

    @Override
    public boolean isEmpty() {
        return numElems == 0;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<E>() {
            private Node<E> rover = head;

            public E next() {
                E top = rover.data;
                rover = rover.next;
                return top;
            }

            public boolean hasNext() {
                return rover != null;
            }
        };
    }
}