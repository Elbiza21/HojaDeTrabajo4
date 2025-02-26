package Main.java.com.uvg.infixpostfix.factory;

import Main.java.com.uvg.infixpostfix.list.List;
import Main.java.com.uvg.infixpostfix.list.SinglyLinkedList;
import Main.java.com.uvg.infixpostfix.list.DoublyLinkedList;

public class ListFactory {

    public static <T> List<T> createList(String listType) {
        switch (listType) {
            case "SinglyLinked":
                return new SinglyLinkedList<>();
            case "DoublyLinked":
                return new DoublyLinkedList<>();
            default:
                throw new IllegalArgumentException("Tipo de lista no soportado");
        }
    }
}
