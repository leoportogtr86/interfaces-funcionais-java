package com.porto.exerciciosConsumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        Consumer<String> printUpper = e -> System.out.println(e.toUpperCase());

        Stream.of("ovo", "bola", "panqueca")
                .forEach(printUpper);
    }
}

//2. **Conversão para Maiúsculas**
//- Implemente um `Consumer<String>` que converte uma string
//para maiúsculas e imprime o resultado. Aplique
//esse `Consumer` a uma lista de strings.
