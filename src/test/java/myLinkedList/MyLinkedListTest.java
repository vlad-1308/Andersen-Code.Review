package myLinkedList;

import myArrayList.MyArrayList;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest{

    class MyValue implements Comparator<MyValue> {
        private int u;
        public MyValue(int s){
            this.u = s;
        }

        public int getU() {
            return u;
        }

        @Override
        public int compare(MyValue o1, MyValue o2) {
            int result = 0;

            if (o1.getU() > o2.getU()) {
                result = 1;
            } else if (o1.getU() < o2.getU()) {
                result = -1;
            } else {
                result = 0;
            }

            return result;
        }
    }

    @Test
    void delete() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst("hello");

        assertFalse(s.delete(0));
    }

    @Test
    void addLast() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addLast("hello");
        assertNotNull(s);
    }

    @Test
    void addFirst() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst("hello");
        assertNotNull(s);
    }

    @Test
    void addAllFirst() {
        MyLinkedList<String> s = new MyLinkedList<>();
      //  s.addAllFirst(String "hello");
        assertNotNull(s);
    }

    @Test
    void addAllLast() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst("hello");
        assertNotNull(s);
    }

    @Test
    void sort() {
        MyLinkedList<MyValue> l = new MyLinkedList<>();
        MyValue c2 = new MyValue(2);
        MyValue c3 = new MyValue(3);
        MyValue c1 = new MyValue(1);

        l.addLast(c1);
        l.addLast(c3);
        l.addLast(c2);
        l.sort(c1);

        MyLinkedList<MyValue> lt = new MyLinkedList<>();
        lt.addLast(c1);
        lt.addLast(c2);
        lt.addLast(c3);

        Iterator iteratorl = l.iterator();
        Iterator iteratorlt = lt.iterator();

        for (int i = 0; i < 3; i++) {
            assertEquals(iteratorl.next(),iteratorlt.next());
        }
    }

    @Test
    void get() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst( "hello");
        System.out.println(s.get(0));
    }

    @Test
    void getNextNode() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst( "hello");
//        System.out.println(s.getNextNode(s));
    }

    @Test
    void getSize() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst("h");
        s.addFirst("e");
        assertEquals(2,s.getSize());
    }

    @Test
    void isEmpty() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst("h");
        s.addFirst("e");
        assertFalse(s.isEmpty());
    }

    @Test
    void clear() {
        MyLinkedList<String> s = new MyLinkedList<>();
        s.addFirst("h");
        s.addFirst("e");
        s.clear();
        assertEquals(0,s.getSize());
    }

}