package collectionsRevision;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class OurCustomList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public OurCustomList() {
        size = 0;
        items = (T[]) new Object[100];
    }

    // Stores item in the array at index size and increment the size afterwards
    public void add(T item) {
        items[size++] = item;
    }

    public T getIemAtIndex(int index) {
        return items[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new OurCustomListIterator(this);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }

    private class OurCustomListIterator implements Iterator<T> {
        private OurCustomList<T> list;
        private int index = 0;

        public OurCustomListIterator(OurCustomList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            /**
             * Returns the value at current index and then increment the index
             */
            return list.items[index++];
        }
    }
}
