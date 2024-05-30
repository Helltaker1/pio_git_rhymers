package edu.kis.vh.nursery.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntLinkedListTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        assertTrue(list.isEmpty(), "List should be empty initially");

        list.push(10);
        assertFalse(list.isEmpty(), "List should not be empty after pushing an element");
        assertEquals(10, list.top(), "Top element should be 10");
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        assertTrue(list.isEmpty(), "List should be empty initially");

        list.push(10);
        assertFalse(list.isEmpty(), "List should not be empty after pushing an element");
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        assertFalse(list.isFull(), "List should never be full");
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(IntLinkedList.returnValue, list.top(), "Top of an empty list should return returnValue");

        list.push(10);
        assertEquals(10, list.top(), "Top element should be 10");

        list.push(20);
        assertEquals(20, list.top(), "Top element should be 20");
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        assertEquals(IntLinkedList.returnValue, list.pop(), "Pop from an empty list should return returnValue");

        list.push(10);
        list.push(20);
        assertEquals(20, list.pop(), "Popped element should be 20");
        assertEquals(10, list.pop(), "Popped element should be 10");
        assertEquals(IntLinkedList.returnValue, list.pop(), "Pop from an empty list should return returnValue");
    }
}
