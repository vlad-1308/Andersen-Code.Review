import java.util.*;

public interface MyList<T> {

    void add(T t);

    void add(T t, int index);

    void sort(Comparator<? super T> comparator);

    //Same as concat() по индексу
    void addAll(Collection<? extends T> newList, int index);

    //Добавление всех эл-ов в конец
    void addAll(Collection<? extends T> newList);

    boolean delete(int i);

    T get(int index);

    int size();

    //Возвращает массив индексов по совпадениям
    int[] indexOf(T t);

    T[] toArray();

    boolean isEmpty();

    //Удаляет внутренний массив коллекции и создает новый пустой
    boolean clear();

    //Проверяет наличие элемента в списке
    boolean contains(T t);

}
