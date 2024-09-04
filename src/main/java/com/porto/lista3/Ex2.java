package com.porto.lista3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 {
    public static void main(String[] args) {
        Predicate<String> hasMais5Letras = e -> e.length() > 5;
        List<String> palavras = Arrays.asList("ovo", "bolada", "biscoito", "uva", "ceu", "malote");

        palavras.stream()
                .filter(hasMais5Letras)
                .forEach(System.out::println);
    }
}

//2. **Verificação de Palavras com Mais de 5 Letras**
//- Implemente um `Predicate<String>` que verifica se uma string
//tem mais de 5 letras. Aplique esse predicado em uma
//lista de palavras e retorne as palavras que atendem a essa condição.
