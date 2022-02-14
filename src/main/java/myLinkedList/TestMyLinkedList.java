package myLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMyLinkedList {

    @Test
    void addLast() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        assertNotNull(list);
        assertEquals(4, list.getSize());
    }

    @Test
    void sort() {
    }

    @Test
    void addAll() {
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void getSize() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void clear() {
    }
}