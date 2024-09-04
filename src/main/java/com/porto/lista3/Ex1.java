package com.porto.lista3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {
    public static void main(String[] args) {
        Predicate<Integer> isImpar = e -> e % 2 != 0;
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> impares = inteiros.stream().filter(isImpar).toList();

        System.out.println(impares);
    }
}

//1. **Filtro de Números Ímpares**
//- Crie um `Predicate<Integer>` que verifica se um número é ímpar.
//Use este predicado para filtrar uma lista de
//inteiros e retornar apenas os números ímpares.
