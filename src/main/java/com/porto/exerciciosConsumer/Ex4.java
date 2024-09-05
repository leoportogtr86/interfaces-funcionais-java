package com.porto.exerciciosConsumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        Consumer<String> printLen = e -> System.out.println(e.length());

        Stream.of("uva", "predio", "cabo", "a", "Bia")
                .forEach(printLen);
    }
}

//4. **Contagem de Caracteres**
//- Crie um `Consumer<String>` que conta e imprime o número de
//caracteres em uma string. Aplique esse `Consumer` a uma
//lista de palavras e imprima a contagem para cada uma.
