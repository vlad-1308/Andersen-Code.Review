import myArrayList.MyArrayList;
import myLinkedList.MyLinkedList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class TestMyArrayList {

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
    void getSize() {
        assertEquals(0,0);
    }

    @Test
    void add() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);
        assertNotNull(l);
    }


    @Test
    void sort() {
        MyArrayList<MyValue> l = new MyArrayList<>();
        MyValue c2 = new MyValue(2);
        MyValue c3 = new MyValue(3);
        MyValue c1 = new MyValue(1);

        l.add(c1);
        l.add(c3);
        l.add(c2);
        l.sort(c1);

        MyLinkedList<MyValue> lt = new MyLinkedList<>();
        lt.addLast(c1);
        lt.addLast(c2);
        lt.addLast(c3);

        for (int i = 0; i < 3; i++) {
            assertEquals(l.get(i),lt.get(i));
        }
    }

    @Test
    void addAll() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        MyArrayList<Integer> l2 = new MyArrayList<>();
        l2.addAll(l);
        assertNotNull(l2);
    }


    @Test
    void delete() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);

        l.delete(1);

        assertArrayEquals(new int []{},new int []{});
    }

    @Test
    void get() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);
        assertEquals(1,l.get(0));
    }

    @Test
    void indexOf() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(8);
        assertEquals(0,l.indexOf(8));
    }

    @Test
    void toArray() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.toArray();
        assertArrayEquals(new int []{1,2,3},new int []{1,2,3});
    }

    @Test
    void isEmpty() {
        MyArrayList<Integer> l = new MyArrayList<>();
        assertTrue(l.isEmpty());
    }

    @Test
    void clear() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertArrayEquals(new int []{},new int[]{});
    }

    @Test
    void contains() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        assertFalse(l.contains(4));
    }
}