package Main.java.com.uvg.infixpostfix.singleton;

import Main.java.com.uvg.infixpostfix.stack.Stack;
import Main.java.com.uvg.infixpostfix.factory.StackFactory;

public class CalculatorSingleton {
    private static CalculatorSingleton instance;

    private CalculatorSingleton() {}

    public static CalculatorSingleton getInstance() {
        if (instance == null) {
            instance = new CalculatorSingleton();
        }
        return instance;
    }

    public String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = StackFactory.createStack(1); // Por defecto usa ArrayListStack

        for (char ch : infix.toCharArray()) {
            if (Character.isDigit(ch)) {
                postfix.append(ch).append(' ');
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim();
    }

    public int evaluatePostfix(String postfix) {
        Stack<Integer> stack = StackFactory.createStack(1);

        for (String token : postfix.split(" ")) {
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token.charAt(0)) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        return stack.pop();
    }

    private int precedence(char op) {
        switch (op) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            default: return -1;
        }
    }
}
