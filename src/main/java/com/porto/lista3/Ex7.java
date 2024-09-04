package com.porto.lista3;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex7 {
    public static void main(String[] args) {
        Predicate<Integer> divisivelPor5 = e -> e % 5 == 0;

        Stream.of(1, 2, 3, 4, 5, 6, 7, 10, 15, 21, 25)
                .filter(divisivelPor5)
                .forEach(System.out::println);
    }
}

//7. **Número Divisível por 5**
//- Crie um `Predicate<Integer>` que verifica se um número é divisível por 5.
//Use esse predicado para filtrar uma
//lista de números e retornar apenas aqueles que são divisíveis por 5.
