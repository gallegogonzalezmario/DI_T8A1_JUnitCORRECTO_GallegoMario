package es.ieslosmontecillos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        // Prueba individual
        // ----------------------------------------------------------
        // Operación -> Suma de 2 enteros de valor 2
        // Resultado esperado -> 4
        // Resultado -> 4
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        // Prueba múltiple
        // ----------------------------------------------------------
        // Operación -> Multiplicación de 2 enteros de valor 2
        // Resultado esperado -> 4
        // Resultado -> 4
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),

                // Operación -> Multiplicación de 2 enteros de valor 2 y -2
                // Resultado esperado -> -4
                // Resultado -> -4
                () -> assertEquals(-4, Calculator.multiply(2, -2)),

                // Operación -> Multiplicación de 2 enteros de valor -2
                // Resultado esperado -> 4
                // Resultado -> 4
                () -> assertEquals(4, Calculator.multiply(-2, -2)),

                // Operación -> Multiplicación de 2 enteros de valor 1 y 0
                // Resultado esperado -> 0
                // Resultado -> 0
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Cardinalidad")
    void cardinalidad() {
        assertAll(() -> assertEquals(0, Calculator.max(new int[]{})),
                () -> assertEquals(1, Calculator.max(new int[]{1})),
                () -> assertEquals(2, Calculator.max(new int []{1, 2})));
    }

    @Test
    @DisplayName("Ordinalidad")
    void ordinalidad(){
        assertAll(() -> assertEquals(7, Calculator.max(new int[]{5, 6, 7})),
                () -> assertEquals(7, Calculator.max(new int[]{7, 6, 5})),
                () ->  assertEquals(7, Calculator.max(new int[]{5, 7, 6})));
    }

    @Test
    @DisplayName("rango")
    void rango() {
        assertAll(() -> assertEquals(Integer.MAX_VALUE, Calculator.max(new int[]{Integer.MAX_VALUE, 9999999, 0})),
                () -> assertEquals(-54, Calculator.max(new int[]{-54, -125, Integer.MIN_VALUE})));
    }
}