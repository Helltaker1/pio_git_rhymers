package edu.kis.vh.nursery.list;

/**
 * The IntLinkedList class represents a doubly linked list of integers.
 * It supports basic operations such as push, pop, and checking if the list is empty or full.
 */
public class IntLinkedList {

    /**
     * The constant value returned when an operation fails.
     */
    public static final int returnValue = -1;

    /**
     * The last node in the linked list.
     */
    private Node last;

    /**
     * An integer used for various purposes (currently unused).
     */

    // TODO: Remove unused variable 'i' if it's not needed in the future
    private int i;

    /**
     * Pushes a new integer onto the top of the linked list.
     * If the list is empty, creates a new node as the last element.
     * Otherwise, adds the new node to the end of the list.
     *
     * @param i the integer to be added to the list
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the linked list is full.
     * This implementation always returns false since the list is dynamically sized.
     *
     * @return false always, as the list cannot be full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value of the last element in the list without removing it.
     * If the list is empty, returns returnValue.
     *
     * @return the value of the last element, or returnValue if the list is empty
     */
    public int top() {
        if (isEmpty())
            return returnValue;
        return last.value;
    }

    /**
     * Removes and returns the value of the last element in the list.
     * If the list is empty, returns returnValue.
     *
     * @return the value of the last element, or returnValue if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return returnValue;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    /**
     * The Node class represents a node in a doubly linked list.
     */
    private class Node {
        /**
         * The value stored in the node.
         */
        private int value;

        /**
         * A reference to the previous node in the list.
         */
        private Node prev;

        /**
         * A reference to the next node in the list.
         */
        private Node next;

        /**
         * Creates a new node with the specified value.
         *
         * @param i the value to be stored in the node
         */
        private Node(int i) {
            value = i;
        }
    }

}
