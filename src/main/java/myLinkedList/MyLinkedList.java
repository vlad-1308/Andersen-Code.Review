package myLinkedList;

import myArrayList.MyList;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ListIterator;

public class MyLinkedList<T> implements IMyList<T> {

    private int size;
    private MyNode<T> next;
    private MyNode<T> prev, first, last;

    @Override
    public boolean delete(int i) {
        return false;
    }

    public MyLinkedList() {

    }

    public MyLinkedList(@NotNull Collection<? extends T> coll) {
        this();

    }

    @Override
    public void add(T t) {
        MyNode node = new MyNode<>( prev,t, null);
        if (first == null) {
            node.next=null;
            node.prev=null;
            first=node;
            last=node;
        } else {
            last.next = node;
            node.prev=last;
            last=node;
        }
        size++;
    }


    @Override
    public void sort(Comparator<? super T> comparator) {

    }


    @Override
    public T get(int index) {
        MyNode<T> f = first;
        if (index < size ) {
            for (int i = 0; i < index ; i++) {
                f = f.next;
            }
        }
         return f.item;
    }

    @Override
    public int getSize() {
        return size;
    }



    public boolean isEmpty(MyNode<T> node) {
        if (node!=null){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.next=null;
        this.last=null;
        size=0;
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
