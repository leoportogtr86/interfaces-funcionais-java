package com.porto.lista3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex6 {
    public static void main(String[] args) {
        Predicate<String> nulaOuVazia = e -> e == null || e.isEmpty();
        List<String> palavras = Arrays.asList("", null, "teste", "null");

        palavras.stream()
                .filter(nulaOuVazia)
                .forEach(System.out::println);
    }
}

//6. **Verificação de String Nula ou Vazia**
//        - Implemente um `Predicate<String>` que verifica se uma string
//        é nula ou vazia. Aplique esse predicado a uma lista
//de strings e retorne as strings que são nulas ou vazias.
