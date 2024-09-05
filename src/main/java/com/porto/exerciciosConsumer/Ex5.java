package com.porto.exerciciosConsumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {
        Consumer<String> printWithPrefix = e -> System.out.println("Prefixo_" + e);

        Stream.of("teste", "hello", "fogo", "vento", "agua")
                .forEach(printWithPrefix);
    }
}


//5. **Prefixo de Strings**
//- Crie um `Consumer<String>` que adiciona o prefixo "Prefixo_" a
//uma string e imprime o resultado. Aplique
//esse `Consumer` a uma lista de strings.
