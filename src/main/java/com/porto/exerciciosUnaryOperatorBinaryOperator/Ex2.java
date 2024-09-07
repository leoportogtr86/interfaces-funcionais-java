package com.porto.exerciciosUnaryOperatorBinaryOperator;

import java.util.function.UnaryOperator;

public class Ex2 {
    public static void main(String[] args) {
        UnaryOperator<Integer> quadrado = e -> (int) Math.pow(e, 2);

        System.out.println(quadrado.apply(20));
    }
}

//2. **Quadrado de um Número**
//- Implemente um `UnaryOperator<Integer>` que calcule o
//quadrado de um número inteiro e aplique-o a um valor.
