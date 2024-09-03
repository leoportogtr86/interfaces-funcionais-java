package com.porto.lista2;

import java.util.function.Function;

public class Ex7 {
    public static void main(String[] args) {
        Function<String, String> reverse = e -> new StringBuilder(e).reverse().toString();

        System.out.println(reverse.apply("Java"));
    }
}

//7. **Inversão de Texto**
//- Implemente uma função `Function<String, String>` que
//inverte o texto de uma string. Teste a função com a
//string `"Java"`.