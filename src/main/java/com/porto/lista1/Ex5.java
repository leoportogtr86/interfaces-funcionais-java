package com.porto.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex5 {
    public static void main(String[] args) {
        Function<String, Integer> comprimento = String::length;
        List<String> palavras = Arrays.asList("ovo", "galinha", "cavalo", "bota", "super");

        palavras.stream()
                .map(comprimento)
                .forEach(System.out::println);
    }
}


//5. **Interfaces Funcionais Padrão - `Function<T, R>`:**
//- Implemente uma função que converta uma lista de Strings em
//uma lista de seus respectivos comprimentos usando a
//interface `Function<String, Integer>`.
