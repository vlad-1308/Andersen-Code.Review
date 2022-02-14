package myLinkedList;

import myArrayList.MyList;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyLinkedList<T> implements IMyList<T>, Iterable<T> {

    private int size;
    private MyNode<T> firstNode, lastNode;

    @Override
    public boolean delete(int i) {
        return false;
    }

    public MyLinkedList() {
        lastNode = new MyNode<T>(null, firstNode, null);
        firstNode = new MyNode<T>(null, null, lastNode);
        size = 0;
    }

    public MyLinkedList(@NotNull Collection<? extends T> coll) {
        this();

    }

    @Override
    public void addLast(T t) {
        MyNode<T> prev = lastNode;
        prev.item = t;
        lastNode = new MyNode<>(null, prev, null);
        prev.next = lastNode;
        size++;
    }

    @Override
    public void addFirst(T t) {
        MyNode<T> next = firstNode;
        next.item = t;
        firstNode = new MyNode<T>(null, null, next);
        next.prev = firstNode;
        size++;
    }

    @Override
    public void sort(Comparator<? super T> comparator) {

    }

    @Override
    public T get(int index) {
        MyNode<T> f = firstNode.next;
        if (index < size ) {
            for (int i = 0; i < index ; i++) {
                f = getNextNode(f);
            }
        }
         return f.item;
    }

    public MyNode<T> getNextNode(MyNode<T> current) {
        return current.next;
    }

    @Override
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        this.firstNode=null;
        this.lastNode=null;
        size=0;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                return get(count++);
            }
        };
    }

    private static class MyNode<T> {
        T item;
        MyNode<T> next;
        MyNode<T> prev;


        MyNode(T element, MyNode<T> prev, MyNode<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
