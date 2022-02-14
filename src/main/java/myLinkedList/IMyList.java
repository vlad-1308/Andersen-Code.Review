package myLinkedList;

import java.util.Collection;
import java.util.Comparator;

public interface IMyList<T> {

    void addLast(T t);

    void addFirst(T t);

    void sort(Comparator<? super T> comparator);

    boolean delete(int i);

    Object get(int index);

    int getSize();

    //Удаляет внутренний массив коллекции и создает новый пустой
    void clear();

}
