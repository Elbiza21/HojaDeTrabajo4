package Main.java.com.uvg.infixpostfix.factory;

import Main.java.com.uvg.infixpostfix.stack.Stack;
import Main.java.com.uvg.infixpostfix.stack.ArrayListStack;
import Main.java.com.uvg.infixpostfix.stack.VectorStack;

import Main.java.com.uvg.infixpostfix.stack.ArrayListStack;
import Main.java.com.uvg.infixpostfix.stack.ListStack;
import Main.java.com.uvg.infixpostfix.stack.Stack;
import Main.java.com.uvg.infixpostfix.stack.VectorStack;
import Main.java.com.uvg.infixpostfix.list.SinglyLinkedList;
import Main.java.com.uvg.infixpostfix.list.DoublyLinkedList;

import java.util.Scanner;

public class StackFactory {
    public static <T> Stack<T> createStack(int choice) {
        switch (choice) {
            case 1:
                return new ArrayListStack<>();
            case 2:
                return new VectorStack<>();
            case 3:
                return createListStack();
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }

    private static <T> Stack<T> createListStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la implementación de la lista:");
        System.out.println("1. Lista simplemente encadenada");
        System.out.println("2. Lista doblemente encadenada");
        int listChoice = scanner.nextInt();

        switch (listChoice) {
            case 1:
                return new ListStack<>(new SinglyLinkedList<>());
            case 2:
                return new ListStack<>(new DoublyLinkedList<>());
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }
}
