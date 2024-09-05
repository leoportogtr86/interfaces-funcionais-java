package com.porto.exerciciosConsumer;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        Consumer<Integer> print = System.out::println;

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .forEach(print);

    }
}

//1. **Impressão de Inteiros**
//- Crie um `Consumer<Integer>` que imprime um número inteiro.
//Aplique esse `Consumer` a uma lista de números inteiros
//e imprima todos os números.
