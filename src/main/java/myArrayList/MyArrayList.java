package myArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

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
    public void add(T o) {
        this.add(o, size);
    }

    // Добавляет элемент в указанную точку списка. При этом все значения справа съезжают на одну позицию для
    // освобождения места. Если размер массива равен размеру списка, то происходит увеличение размера.
    public void add(T o, int index) {
        if (index > this.getLength()) {
            throw new IndexOutOfBoundsException("Введенный индекс превышает размер целевого списка");
        }
        if (getLength() == size) {
            this.array = upLength(1);
        }
        if (this.getSize() - index > 0) {

            for (int i = getSize(); i > index - 1; i--) {
                array[i + 1] = array[i];
            }
        }
        this.array[index] = o;
        size++;
    }

    @Override
    public void sort(Comparator comparator) {
        //trofimov
        Arrays.sort(array, 0, size, comparator);
    }

    /*  Метод добавляет в список всю коллекцию в определенное место списка, начиная с index. Возвращает true в случае
        удачного выполнения.*/

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
            return array = Arrays.copyOf(array, capacity + this.getLength() + (capacity - DEFAULT_CAPACITY));
        }
    }

    // Добавляет коллекцию строго в конец нашего списка.
    @Override
    public boolean addAll(@NotNull Collection<? extends T> newList) {
        return this.addAll(newList, this.getSize());
    }

    @Override
    public boolean delete(int index) {
        if (index > this.getLength()) {
            throw new IndexOutOfBoundsException("Введенный индекс превышает размер целевого списка");
        }

        for (int i = index - 1; i < this.getSize(); i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
        return true;
    }


    @Override
    public Object get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        else {
            throw new IndexOutOfBoundsException("Выход за пределы списка.");
        }
    }

    //Возвращает индекс первого совпадения. Если совпадений нет, то возвращает -1.

    public int indexOf(@NotNull T t) {
        for (int i = 0; i < this.getSize(); i++) {
            if (this.array[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    // Возвращает все элементы списка в массиве.

    public Object[] toArray() {
        Object[] destArr = new Object[this.getSize()];
        System.arraycopy(this.array, 0, destArr, 0, this.getSize());
        return destArr;
    }

    @Override
    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    /*
    * Перезаписывает елемент на пустой
    */
    @Override
    public void clear() {
        this.array= new Object[DEFAULT_CAPACITY];
        size = 0;
    }

   /*
    *Метод проверяет наличие елемента в списке елементов
   * Если список пуст вернуть false. Если елемент найден вернуть true;
   */

    public boolean contains(Object o) {
      for (int i = 0 ; i <array.length; i++){
          if (this.array[i]== null){
              return false;
          }
          else if (array[i].equals(o)){
              return true;
          }
      }
        return false;
    }

}