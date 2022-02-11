public class MyArrayList<T> implements MyList {

    private int size = 10;
    private Object [] array = new Object[size];
    private int num;

    @Override
    public void add(Object o) {
        array[num++]=o;
    }

    @Override
    public void add(Object o, int index) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void addAll(MyList newList) {

    }

    @Override
    public boolean delete(int i) {
        return false;
    }

    @Override
    public Object get(int index) {

        return (Object) array[index];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    /*
    * Перезаписывает елемент на пустой
    */
    @Override
    public void clear() {

        for (int i = 0; i<array.length;i++){
            if (array[i]!=null){
                array[i]=null;
            }
        }

    }

   /*
    *Метод проверяет наличие елемента в списке елементов
   * Если список пуст вернуть false. Если елемент найден вернуть true;
   */
    @Override
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
