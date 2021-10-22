import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TListTest {

    TList <Integer> container;

    @BeforeEach
    void setUp() {
        container = new TList<>();
    }

    @Test
    void isEmpty() {
        assertEquals(container.isEmpty(), true);
        container.addToHead(1);
        assertEquals(container.isEmpty(), false);
    }

    @Test
    void getSize() {
        assertEquals(container.getSize(), 0);
        container.addToHead(1);
        container.addToTail(2);
        container.addToTail(3);
        assertEquals(container.getSize(), 3);
    }

    @Test
    void getElem() {
        container.addToHead(1);
        assertEquals(container.getElem(0), null);
    }

    @Test
    void addToHead() {
        assertEquals(container.getSize(), 0);
        for (int i=0; i<3; i++)
            container.addToHead(i);
        assertEquals(container.getSize(), 3);

    }

    @Test
    void addToTail() {
        assertEquals(container.getSize(), 0);
        container.addToTail(1);
        assertEquals(container.getSize(), 1);
    }

    @Test
    void addByIndex() {
        assertEquals(container.getSize(), 0);
        container.addToHead(1);
        for (int i=0; i<3; i++)
            container.addByIndex(i+2, i+2);
        assertEquals(container.getSize(), 4);
    }

    @Test
    void deleteFromHead() {
        assertEquals(container.getSize(), 0);
        container.addToHead(1);
        assertEquals(container.getSize(), 1);
        container.deleteFromHead();
        assertEquals(container.getSize(), 0);
    }

    @Test
    void deleteFromTail() {
        assertEquals(container.getSize(), 0);
        container.addToHead(1);
        assertEquals(container.getSize(), 1);
        container.deleteFromTail();
        assertEquals(container.getSize(), 0);
    }

    @Test
    void deleteByIndex() {
        assertEquals(container.getSize(), 0);
        container.addToHead(1);
        for (int i=0; i<3; i++)
            container.addByIndex(i+2, i+2);
        assertEquals(container.getSize(), 4);
        container.deleteByIndex(1);
        assertEquals(container.getSize(), 3);
    }
}