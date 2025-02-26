package Test.java.com.uvg.infixpostfix.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        CalculatorSingleton calculator = CalculatorSingleton.getInstance();
        assertEquals(5, calculator.add(2, 3));  // La suma de 2 + 3 debe ser 5
    }

    @Test
    public void testSubtract() {
        CalculatorSingleton calculator = CalculatorSingleton.getInstance();
        assertEquals(1, calculator.subtract(5, 4));  // La resta de 5 - 4 debe ser 1
    }

    @Test
    public void testMultiply() {
        CalculatorSingleton calculator = CalculatorSingleton.getInstance();
        assertEquals(6, calculator.multiply(2, 3));  // La multiplicación de 2 * 3 debe ser 6
    }

    @Test
    public void testDivide() {
        CalculatorSingleton calculator = CalculatorSingleton.getInstance();
        assertEquals(2, calculator.divide(6, 3));  // La división de 6 / 3 debe ser 2
    }

    @Test
    public void testDivideByZero() {
        CalculatorSingleton calculator = CalculatorSingleton.getInstance();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1, 0);  // No se debe poder dividir por 0
        });
    }
}
