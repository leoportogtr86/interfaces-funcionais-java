package com.porto.lista3;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex8 {
    public static void main(String[] args) {
        Predicate<String> containsR = e -> e.contains("r");

        Stream.of("bela", "risada", "rota", "", "mau", "mar")
                .filter(containsR)
                .forEach(System.out::println);
    }
}


//8. **Palavras com Consoantes Específicas**
//- Implemente um `Predicate<String>` que verifica se uma string contém
//a consoante 'r'. Aplique esse predicado a uma
//lista de palavras e retorne as palavras que contêm a consoante 'r'.
