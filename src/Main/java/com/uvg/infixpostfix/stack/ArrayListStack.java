package Main.java.com.uvg.infixpostfix.stack;

import java.util.ArrayList;
public class ArrayListStack<T> extends AbstractStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() {
        return !isEmpty() ? stack.remove(stack.size() - 1) : null;
    }

    @Override
    public T peek() {
        return !isEmpty() ? stack.get(stack.size() - 1) : null;
    }

    @Override
    public int size() {
        return stack.size();
    }
}