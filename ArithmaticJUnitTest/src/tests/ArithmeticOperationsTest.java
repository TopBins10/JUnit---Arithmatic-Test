package src.tests;

import src.main.ArithmeticOperations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {

    private ArithmeticOperations arithmeticOperations;

    @BeforeEach
    void setUp() {
        arithmeticOperations = new ArithmeticOperations();
    }

    @Test
    void testAdd() {
        assertEquals(5, arithmeticOperations.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, arithmeticOperations.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, arithmeticOperations.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, arithmeticOperations.divide(4, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            arithmeticOperations.divide(4, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
