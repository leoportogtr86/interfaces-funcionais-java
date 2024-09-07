package com.porto.exerciciosUnaryOperatorBinaryOperator;

import java.util.function.UnaryOperator;

public class Ex5 {
    public static void main(String[] args) {
        UnaryOperator<Integer> fatorial = e -> {
            int result = 1;
            for (int i = 1; i <= e; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(fatorial.apply(5));
    }
}

//5. **Calcular o Fatorial**
//- Crie um `UnaryOperator<Integer>` que calcule o fatorial
//de um número e aplique-o a um valor.
