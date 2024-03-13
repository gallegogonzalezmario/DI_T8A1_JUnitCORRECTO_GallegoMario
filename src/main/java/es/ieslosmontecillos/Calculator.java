/*
    Mario Gallego González
    2DAM
    2023/24
    DI
    Tema 8 Actividad 1 Prueba JUnit 5 método CORRECTO
 */
package es.ieslosmontecillos;

import java.util.stream.DoubleStream;


public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    public static int max(int[] a){
        int i,m;

        // Condición para arrays vacíos
        // Si tiene al menos un valor, recoge el primer valor
        // Si no tiene ningún tamaño, recoge el valor 0
        m = (a.length > 0) ? a[0] : 0;

        for (i=1;i<a.length;i++){
            if(a[i]>m)
                m=a[i];
        }

        return m;
    }
}