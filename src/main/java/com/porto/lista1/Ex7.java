package com.porto.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bola", "carrinho", "video game", "peão");
        Consumer<String> print = System.out::println;

        words.forEach(print);
    }
}


//7. **Uso de `Consumer<T>`:**
//- Crie uma lista de Strings e use a interface `Consumer<String>`
//para imprimir cada elemento da lista em uma linha
//separada.
