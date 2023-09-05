package csci2320.Sequence;

public class LinkedSeq<E> implements Seq<E> {

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
}