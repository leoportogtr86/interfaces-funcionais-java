package com.porto.lista3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex4 {
    public static void main(String[] args) {
        Predicate<String> startWithJ = e -> e.startsWith("J");
        List<String> nomes = Arrays.asList("Junior", "Bob", "Billy", "Jim");

        nomes.stream()
                .filter(startWithJ)
                .forEach(System.out::println);
    }
}

//4. **Palavras que Começam com 'J'**
//        - Crie um `Predicate<String>` que verifica se uma string
//        começa com a letra 'J'. Aplique esse predicado em uma lista
//de nomes e retorne os nomes que começam com 'J'.
