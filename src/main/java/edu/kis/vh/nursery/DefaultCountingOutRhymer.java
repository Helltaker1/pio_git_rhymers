package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_ARRAY_SIZE = 12;
    private static final int TOTAL_INIT_SIZE = -1;
    private static final int RETURN_VALUE = -1;
    private int[] numbers = new int[NUMBERS_ARRAY_SIZE];
    // TODO: Move getTotal() method below the total variable declaration for better readability
    public int getTotal() {
        return total;
    }

    private int total = TOTAL_INIT_SIZE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_INIT_SIZE;
    }

    public boolean isFull() {
        return total == NUMBERS_ARRAY_SIZE + TOTAL_INIT_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}