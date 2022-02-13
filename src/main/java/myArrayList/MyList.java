package myArrayList;

import java.util.*;

public interface MyList<T> {

    void add(T t);

    void add(T t, int index);

    void sort(Comparator<? super T> comparator);

    //Добавление всех эл-ов в конец
    boolean addAll(Collection<? extends T> newList);

    boolean delete(int i);

    Object get(int index);

    int getSize();

    boolean isEmpty();

    //Удаляет внутренний массив коллекции и создает новый пустой
    void clear();


}
