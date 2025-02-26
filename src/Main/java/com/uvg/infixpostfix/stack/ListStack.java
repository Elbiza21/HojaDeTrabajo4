package Main.java.com.uvg.infixpostfix.stack;

import Main.java.com.uvg.infixpostfix.list.List;
class ListStack<T> extends AbstractStack<T> {
    private List<T> list;

    public ListStack(List<T> list) {
        this.list = list;
    }

    @Override
    public void push(T item) {
        list.add(item);
    }

    @Override
    public T pop() {
        return list.remove();
    }

    @Override
    public T peek() {
        return list.get(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }
}

