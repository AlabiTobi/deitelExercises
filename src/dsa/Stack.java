package dsa;

public class Stack {
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }
    public void push (int element) {
        isEmpty = false;
    }
    public void pop () {
        isEmpty = true;
    }
}
