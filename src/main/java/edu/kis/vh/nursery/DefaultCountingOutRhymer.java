package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int numbersArraySize = 12;
    public static final int totalInitSize = -1;
    public static final int returnValue = -1;
    private int[] numbers = new int[numbersArraySize];

    public int total = totalInitSize;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == totalInitSize;
    }

    public boolean isFull() {
        return total == numbersArraySize + totalInitSize;
    }

    protected int peekaboo() {
        if (callCheck())
            return returnValue;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return returnValue;
        return numbers[total--];
    }

}
