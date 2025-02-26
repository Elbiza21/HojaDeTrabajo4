package Main.java.com.uvg.infixpostfix.stack;

abstract class AbstractStack<T> implements Stack<T> {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
