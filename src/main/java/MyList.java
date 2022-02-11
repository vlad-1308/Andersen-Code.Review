import java.util.*;

public interface MyList<T> {

    void add(T t);

    void add(T t, int index);

    void sort(Comparator<? super T> comparator);

    //Same as concat() по индексу
    boolean addAll(Collection<? extends T> newList, int index);

    //Добавление всех эл-ов в конец
    boolean addAll(Collection<? extends T> newList);

    boolean delete(int i);

    Object get(int index);

    int getSize();

    //Возвращает индекс по первому совпадению
    int indexOf(T t);

    Object[] toArray();

    boolean isEmpty();

    //Удаляет внутренний массив коллекции и создает новый пустой
    void clear();

    //Проверяет наличие элемента в списке
    boolean contains(T t);

}
