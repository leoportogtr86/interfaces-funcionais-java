package com.porto.lista3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex3 {
    public static void main(String[] args) {
        Predicate<Integer> maiorDeIdade = e -> e >= 18;
        List<Integer> idades = Arrays.asList(10, 12, 18, 21, 45, 0);

        idades.stream()
                .filter(maiorDeIdade)
                .forEach(System.out::println);
    }
}

//3. **Filtragem de Idades para Maioridade**
//        - Crie um `Predicate<Integer>` que verifica se uma pessoa é maior de idade (18 anos ou mais). Use esse predicado
//para filtrar uma lista de idades e retornar as idades que representam pessoas maiores de idade.
