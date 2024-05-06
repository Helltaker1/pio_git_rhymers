package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int numbersArraySize = 12;
    public static int totalSize = -1;
    private int[] numbers = new int[numbersArraySize];

    public int total = totalSize;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == totalSize;
    }

    public boolean isFull() {
        return total == numbersArraySize - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
