package Main.java.com.uvg.infixpostfix.list;

class SinglyLinkedList<T> extends AbstractList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    @Override
    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T remove() {
        if (head != null) {
            T data = head.data;
            head = head.next;
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
