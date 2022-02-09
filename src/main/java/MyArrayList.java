import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<T> implements MyList {

    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private T[] array;

  /*  public MyArrayList(int size) {
        this.size = size;
    }

    public MyArrayList(T[] array) {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
    }

    public MyArrayList() {
       // this.array = (T[]) new Object[DEFAULT_CAPACITY];
    } */

    @Override
    public void add(Object o) {

    }

    @Override
    public void add(Object o, int index) {

    }

    @Override
    public void sort(Comparator comparator) {

    }

    @Override
    public void addAll(Collection newList, int index) {

    }

    @Override
    public void addAll(Collection newList) {

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
    public int size() {
        return size;
    }

    @Override
    public int[] indexOf(Object o) {
        return new int[0];
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    MyList<String> l = new MyArrayList();
}