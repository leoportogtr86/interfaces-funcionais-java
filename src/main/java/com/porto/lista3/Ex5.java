package com.porto.lista3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex5 {
    public static void main(String[] args) {
        Predicate<Integer> entre10e20 = e -> e >= 10 && e <= 20;
        List<Integer> numeros = Arrays.asList(0, 1, 10, 15, 20, 230);

        numeros.stream()
                .filter(entre10e20)
                .forEach(System.out::println);
    }
}


//5. **Número Dentro de um Intervalo**
//- Crie um `Predicate<Integer>` que verifica se um número está dentro
//do intervalo de 10 a 20 (inclusive). Use esse
//predicado para filtrar uma lista de números e retornar apenas os que
// estão dentro do intervalo.
