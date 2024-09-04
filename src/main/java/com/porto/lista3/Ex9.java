package com.porto.lista3;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex9 {
    public static void main(String[] args) {
        Predicate<String> comprimentoPar = e -> e.length() % 2 == 0;

        Stream.of("teste", "pa", "bobo", "triste")
                .filter(comprimentoPar)
                .forEach(System.out::println);
    }
}

//9. **Filtro de Strings com Comprimento Par**
//- Crie um `Predicate<String>` que verifica se o comprimento
//de uma string é par. Use esse predicado para filtrar uma
//lista de strings e retornar apenas aquelas com comprimento par.
