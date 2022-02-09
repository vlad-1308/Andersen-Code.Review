public interface MyList<T> {

    // void add(Object o);

    void add(T t);

    void add(Object o, int index);

    void sort();

    //Same as concat();
    void addAll(MyList<T> newList);

    boolean delete(int i);

    T get(int index);

    int size();

    int indexOf(T t);

    T[] toArray();

    boolean isEmpty();

    boolean clear();

    boolean contains(Object o);

}
