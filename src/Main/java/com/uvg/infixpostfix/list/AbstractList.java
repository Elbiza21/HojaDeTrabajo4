package Main.java.com.uvg.infixpostfix.list;

abstract class AbstractList<T> implements List<T> {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
