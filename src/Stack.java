public class Stack <T>{

    private T[] stack;
    private int length;
    private int size = 10;
    private int pointer = -1;

    @SuppressWarnings("unchecked")
    public Stack() {
        stack = (T[]) new Object[size];
    }

    public void push(T element) {
        pointer++;
        length++;

        if (size < length) { throw new StackOverflowError(); }
        stack[pointer] = element;
    }

    public T pop() throws StackUnderFlowError {
        length--;
        if(!isEmpty()) throw new StackUnderFlowError("StackUnderFlowError");
        return stack[pointer--];
    }

    public boolean isEmpty() {
        return length >= 0;
    }

    public int getSize() {
        return length;
    }
}
