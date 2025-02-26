package Main.java.com.uvg.infixpostfix.main;

import Main.java.com.uvg.infixpostfix.stack.Stack;
import Main.java.com.uvg.infixpostfix.factory.StackFactory;
import Main.java.com.uvg.infixpostfix.singleton.CalculatorSingleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la implementación de la pila:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista (encadenada)");
        int choice = scanner.nextInt();

        Stack<String> stack = StackFactory.createStack(choice);
        CalculatorSingleton calculator = CalculatorSingleton.getInstance();

        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String infixExpression = reader.readLine();
            System.out.println("Expresión infix: " + infixExpression);

            String postfixExpression = calculator.infixToPostfix(infixExpression);
            System.out.println("Expresión postfix: " + postfixExpression);

            int result = calculator.evaluatePostfix(postfixExpression);
            System.out.println("Resultado: " + result);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
