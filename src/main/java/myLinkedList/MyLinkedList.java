package myLinkedList;

import myArrayList.MyList;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Comparator;

public class MyLinkedList<T> implements MyList<T> {

    private int size;
    private MyNode<T> next;
    private MyNode<T> prev, first, last;

    public MyLinkedList() {

    }

    public MyLinkedList(@NotNull Collection<? extends T> coll) {
        this();
        addAll(coll);
    }

    @Override
    public void add(T t) {
      /*  MyNode<T> node = new MyNode<>(prev, t, null);
        first = node;
        if (last == null) {
            first = node;
        } else {
            last.prev = node;
        }
        size++; */
    }

    @Override
    public void sort(Comparator<? super T> comparator) {

    }

    @Override
    public boolean addAll(Collection<? extends T> newList) {
        return false;
    }

    @Override
    public boolean delete(int i) {
        return false;
    }

    @Override
    public T get(int index) {
        MyNode<T> f = first;
        if (index < size - 1) {
            for (int i = 0; i < index - 1; i++) {
                f = f.next;
            }
        }
         return f.item;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    private static class MyNode<T> {
        T item;
        MyNode<T> next;
        MyNode<T> prev;

        MyNode(MyNode<T> prev, T element, MyNode<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
