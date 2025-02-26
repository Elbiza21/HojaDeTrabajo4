package Main.java.com.uvg.infixpostfix.factory;

import Main.java.com.uvg.infixpostfix.list.DoublyLinkedList;
import Main.java.com.uvg.infixpostfix.list.List;
import Main.java.com.uvg.infixpostfix.list.SinglyLinkedList;

import java.util.Scanner;

public class ListFactory {
    public static <T> List<T> createList(int choice) {
        switch (choice) {
            case 1:
                return new SinglyLinkedList<>();
            case 2:
                return new DoublyLinkedList<>();
            default:
                throw new IllegalArgumentException("Opción no válida para la lista");
        }
    }

    public static <T> List<T> promptForList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la implementación de la lista:");
        System.out.println("1. Lista simplemente encadenada");
        System.out.println("2. Lista doblemente encadenada");
        int choice = scanner.nextInt();

        return createList(choice);
    }
}