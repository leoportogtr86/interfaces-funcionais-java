package com.porto.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex6 {
    public static void main(String[] args) {
        Function<String, String> toUpper = String::toUpperCase;
        Function<String, String> addPonto = e -> e + ".";
        Function<String, String> maiusculaComPonto = toUpper.andThen(addPonto);
        List<String> palavras = Arrays.asList("Hello", "world");

        palavras.stream()
                .map(maiusculaComPonto)
                .forEach(System.out::println);
    }
}

//6. **Composição de Funções:**
//Crie duas funções `Function<String, String>` que realizem operações de formatação em textos. A primeira função
//deve converter um texto para maiúsculas, e a segunda deve adicionar um ponto final ao final da String. Use o
//método `andThen` para compor essas duas funções em uma terceira função que realize ambas as operações.
