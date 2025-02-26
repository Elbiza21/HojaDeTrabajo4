package Main.java.com.uvg.infixpostfix.list;

public class DoublyLinkedList<T> extends AbstractList<T> {
    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T remove() {
        if (tail != null) {
            T data = tail.data;
            tail = tail.prev;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
            size--;
            return data;
        }
        return null;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}

