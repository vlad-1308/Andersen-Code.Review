import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    //Конструктор с добавлением массива в список
    public MyArrayList(T @NotNull [] array) {
        this.array = new Object[array.length + DEFAULT_CAPACITY];
        System.arraycopy(array, 0, this.array, 0, array.length);
        size = array.length;
    }

    //Конструктор с созданием пустого списка
    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private int getLength() {
        return array.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(Object o) {
    //skalubo
    }

    @Override
    public void add(Object o, int index) {
    //skalubo
    }
    @Override
    public void sort(Comparator comparator) {
    //trofimov
    }

    /*  Метод добавляет в список всю коллекцию в определенное место списка, начиная с index. Возвращает true в случае
        удачного выполнения.*/
    @Override
    public boolean addAll(@NotNull Collection<? extends T> newList, int index) {
        // Если введенный индекс вне рамок размера коллекции, то выбрасывает исключение.
        if (index > this.getLength()) {
            throw new IndexOutOfBoundsException("Введенный индекс превышает размер целевого списка");
        }

        Object[] arrList = newList.toArray();
        int lengthOfAddingArr = arrList.length;

        // Если необходимо, то увеличиваем размер внутреннего массива.
        if (this.getLength() - this.getSize() < arrList.length) {
            this.array = upLength(arrList.length);
        }

        // Если index с которого необходимо начать добавление находится не в конце списка, то освобождаем место во
        // внутреннем массиве, сдвигая вправо элементы после index включительно.
        if (this.getSize() - index > 0) {
            System.arraycopy(array, index, array, index + lengthOfAddingArr, this.getSize() - index);
        }
        System.arraycopy(arrList, 0, this.array, index, lengthOfAddingArr);

        // Увеличиваем размерность нашего списка
        size += lengthOfAddingArr;
        return true;
    }

    /*  Увеличивает размерность внутренного массива. Если требуемое дополнительное место то просиходит стандартное
        увеличение на DEFAULT_CAPACITY. В случае, если места требуется больше, то увеличение происходит на capacity +
        DEFAULT_CAPACITY.*/
    private Object[] upLength(int capacity) {
        if (capacity < DEFAULT_CAPACITY) {
            return array = Arrays.copyOf(array, DEFAULT_CAPACITY + this.getLength());
        } else {
            return array = Arrays.copyOf(array, capacity + this.getLength());
        }
    }

    // Добавляет коллекцию строго в конец нашего списка.
    @Override
    public boolean addAll(@NotNull Collection<? extends T> newList) {
        return this.addAll(newList, this.getSize());
    }

    @Override
    public boolean delete(int i) {
        return false;
        //skalubo
    }

    @Override
    public T get(int index) {
        return null;
        //trofimov
    }

    //Возвращает индекс первого совпадения. Если совпадений нет, то возвращает -1.
    @Override
    public int indexOf(@NotNull T t) {
        for (int i = 0; i < this.getSize(); i++) {
            if (this.array[i].equals(t)) {
                return i;
            }
        }
        return -1;
        //krasnik
    }

    // Возвращает все элементы списка в массиве.
    @Override
    public Object[] toArray() {
        Object[] destArr = new Object[this.getSize()];
        System.arraycopy(this.array, 0, destArr, 0, this.getSize());
        return destArr;
    }

    @Override
    public boolean isEmpty() {
        return this.getSize() == 0;

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