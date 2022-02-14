import myArrayList.MyArrayList;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class TestMyArrayList {

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
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);
        l.add(3);
        l.add(2);
        l.sort((Comparator) l);
        assertEquals(new int[]{1,2,3},l);

    }

    @Test
    void addAll() {
        MyArrayList<Integer> l = new MyArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        MyArrayList<Integer> l2 = new MyArrayList<>();
        l.addAll((Collection<? extends Integer>) l2);
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