package myLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

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