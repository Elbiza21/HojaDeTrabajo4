package Test.java.com.uvg.infixpostfix.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        // Usamos la implementación SinglyLinkedList para las pruebas
        list = new SinglyLinkedList<>();
    }

    @Test
    public void testAddAndRemove() {
        list.add(10);
        list.add(20);
        assertEquals(2, list.size());  // El tamaño debería ser 2 después de agregar dos elementos
        assertEquals(10, list.remove());  // El primer elemento agregado (10) debería ser removido
        assertEquals(1, list.size());  // El tamaño debería ser 1 después de remover un elemento
    }

    @Test
    public void testGet() {
        list.add(10);
        list.add(20);
        assertEquals(10, list.get(0));  // El primer elemento debe ser 10
        assertEquals(20, list.get(1));  // El segundo elemento debe ser 20
    }

    @Test
    public void testIsEmpty() {
        assertTrue(list.isEmpty());  // La lista debería estar vacía al principio
        list.add(10);
        assertFalse(list.isEmpty());  // Después de agregar un elemento, la lista no debería estar vacía
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());  // El tamaño debería ser 0 al principio
        list.add(10);
        assertEquals(1, list.size());  // Después de agregar un elemento, el tamaño debería ser 1
    }

    @Test
    public void testRemoveEmpty() {
        assertNull(list.remove());  // No se puede remover de una lista vacía
    }

    @Test
    public void testGetOutOfBounds() {
        list.add(10);
        assertNull(list.get(2));  // Intentar obtener un índice fuera de los límites debe devolver null
    }
}
