import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Здесь тестируем методы.
        MyArrayList<Integer> list = new MyArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list.add(i);

        }
        list.add(20, 4);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " ");
        }


        System.out.println(list.getSize());
        list.delete(6);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.getSize());
    }
}
