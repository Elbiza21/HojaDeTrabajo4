package Test.java.com.uvg.infixpostfix.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    public void setUp() {
        // Usamos la implementación ArrayListStack para las pruebas
        stack = new ArrayListStack<>();
    }

    @Test
    public void testPushAndPop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());  // El último elemento debería ser 20
        assertEquals(10, stack.pop());  // El siguiente elemento debería ser 10
    }

    @Test
    public void testPeek() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.peek());  // El último elemento debería ser 20 sin eliminarlo
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());  // Al principio la pila debería estar vacía
        stack.push(10);
        assertFalse(stack.isEmpty());  // Después de agregar un elemento no debería estar vacía
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());  // Al principio el tamaño debería ser 0
        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());  // Después de agregar dos elementos, el tamaño debería ser 2
    }

    @Test
    public void testPopEmpty() {
        assertNull(stack.pop());  // No se puede hacer pop en una pila vacía
    }

    @Test
    public void testPeekEmpty() {
        assertNull(stack.peek());  // No se puede hacer peek en una pila vacía
    }
}
