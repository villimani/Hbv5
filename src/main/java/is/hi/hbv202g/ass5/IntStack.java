package is.hi.hbv202g.ass5;

public class Stack {
    final int theCapacity = 10;
    private int[] theStack;
    private int nextPushLocation; // Location in theStack array, where next push
    // will insert. 0 means: stack is empty.

    public Stack() {
        theStack = new int[theCapacity];
        nextPushLocation = 0;
    }

    public int getCapacity() {
        return theCapacity;
    }

    public boolean isFull() {
        if (nextPushLocation == theCapacity) {
            return true;
        } else {
            return false;
        }
    }

    // TODO: Add isEmpty() method

    public void push(int element) throws ArrayIndexOutOfBoundsException {
        theStack[nextPushLocation++] = element;
    }

    public int pop() throws ArrayIndexOutOfBoundsException {
        return theStack[--nextPushLocation];
    }

    public int sum() {
        int currentSum = 0;
        for (int i = nextPushLocation-1; i >= 0; i--) {
            currentSum +=(theStack[i]);
        }
        return currentSum;
    }

}
