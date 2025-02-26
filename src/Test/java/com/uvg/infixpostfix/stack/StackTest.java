package Test.java.com.uvg.infixpostfix.stack;

import com.uvg.infixpostfix.list.SinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack<Integer> arrayListStack;
    private Stack<Integer> vectorStack;
    private Stack<Integer> listStack;

    @BeforeEach
    void setUp() {
        arrayListStack = new ArrayListStack<>();
        vectorStack = new VectorStack<>();
        listStack = new ListStack<>(new SinglyLinkedList<>());
    }

    @Test
    void testPushAndPop() {
        arrayListStack.push(10);
        assertEquals(10, arrayListStack.pop());

        vectorStack.push(20);
        assertEquals(20, vectorStack.pop());

        listStack.push(30);
        assertEquals(30, listStack.pop());
    }

    @Test
    void testPeek() {
        arrayListStack.push(100);
        assertEquals(100, arrayListStack.peek());

        vectorStack.push(200);
        assertEquals(200, vectorStack.peek());

        listStack.push(300);
        assertEquals(300, listStack.peek());
    }

    @Test
    void testIsEmpty() {
        assertTrue(arrayListStack.isEmpty());
        arrayListStack.push(1);
        assertFalse(arrayListStack.isEmpty());

        assertTrue(vectorStack.isEmpty());
        vectorStack.push(2);
        assertFalse(vectorStack.isEmpty());

        assertTrue(listStack.isEmpty());
        listStack.push(3);
        assertFalse(listStack.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, arrayListStack.size());
        arrayListStack.push(5);
        assertEquals(1, arrayListStack.size());

        assertEquals(0, vectorStack.size());
        vectorStack.push(6);
        assertEquals(1, vectorStack.size());

        assertEquals(0, listStack.size());
        listStack.push(7);
        assertEquals(1, listStack.size());
    }
}