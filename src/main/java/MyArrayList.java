import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<T> implements MyList<T> {

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
    public void add(T o) {
    //skalubo
    }

    @Override
    public void add(T o, int index) {
    //skalubo
    }

    @Override
    public void sort(Comparator comparator) {
        //trofimov
        Arrays.sort(array, 0, size, comparator);
    }

    @Override
    public void addAll(Collection newList, int index) {
    //krasnik
    }

    @Override
    public void addAll(Collection newList) {
    //krasnik
    }

    @Override
    public boolean delete(int i) {
        return false;
        //skalubo
    }

    @Override
    public T get(int index) {
        //trofimov
        if (index >= 0 && index < size) {
            return array[index];
        }
        else {
            System.out.println("Выход за границы массива");
            return null;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int[] indexOf(Object o) {
        return new int[0];
        //krasnik
    }

    @Override
    public T[] toArray() {
        return array;
        //muradzade
    }

    @Override
    public boolean isEmpty() {
        return false;
        //muradzade
    }

    @Override
    public boolean clear() {
        return false;
        //orlovskiy
    }

    @Override
    public boolean contains(Object o) {
        return false;
        //orlovskiy
    }

}