package Main.java.com.uvg.infixpostfix.factory;

import Main.java.com.uvg.infixpostfix.stack.Stack;
import Main.java.com.uvg.infixpostfix.stack.ArrayListStack;
import Main.java.com.uvg.infixpostfix.stack.VectorStack;

public class StackFactory {


    public static <T> Stack<T> createStack(String stackType) {
        switch (stackType) {
            case "ArrayList":
                return new ArrayListStack<>();
            case "Vector":
                return new VectorStack<>();
            default:
                throw new IllegalArgumentException("Tipo de pila no soportado");
        }
    }
}
