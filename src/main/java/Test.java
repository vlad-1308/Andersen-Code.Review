import myArrayList.MyArrayList;
import myLinkedList.MyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Здесь тестируем методы.
        MyLinkedList<String> f = new MyLinkedList<String>();
        f.add("Привет");
        f.add("Hello");
        f.add("world");

        System.out.println(f.get(0));
    }
}
