package Main.java.com.uvg.infixpostfix.stack;

// Interfaz de la Pila
public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}