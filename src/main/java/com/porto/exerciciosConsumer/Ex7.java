package com.porto.exerciciosConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex7 {
    public static void main(String[] args) {
        Consumer<Integer> printNumX10 = e -> System.out.println(e * 10);
        List<Integer> numeros = Arrays.asList(9, 10, 2, 3, 45);

        numeros.forEach(printNumX10);
    }
}

//7. **Multiplicação de Números**
//- Crie um `Consumer<Integer>` que multiplica um número por
//10 e imprime o resultado. Aplique esse `Consumer` a uma
//lista de números inteiros.