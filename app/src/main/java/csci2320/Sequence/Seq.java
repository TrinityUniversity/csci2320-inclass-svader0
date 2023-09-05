package csci2320.Sequence;

public interface Seq<E> {
    public E get(int index);

    public void add(E elem);

    public int size();

    public boolean isEmpty();
}
