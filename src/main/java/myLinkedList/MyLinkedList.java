package myLinkedList;

import myArrayList.MyList;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class MyLinkedList<T> implements MyList<T> {


    @Override
    public void add(T t) {

    }

    @Override
    public void add(T t, int index) {

    }

    @Override
    public void sort(Comparator<? super T> comparator) {

    }

    @Override
    public boolean addAll(Collection<? extends T> newList, int index) {
        return false;
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
    public Object get(int index) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    private static class MyNode<E> {
        E item;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
