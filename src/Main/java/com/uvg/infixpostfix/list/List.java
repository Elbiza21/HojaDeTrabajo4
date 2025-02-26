package Main.java.com.uvg.infixpostfix.list;

public interface List<T> {
    void add(T item);
    T remove();
    T get(int index);
    int size();
}
