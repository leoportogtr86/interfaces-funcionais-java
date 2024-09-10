package com.porto.exerciciosReferenciaContrutores;

import com.porto.interfaces.TextConverter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {
    public static void main(String[] args) {
        TextConverter textConverter = String::toUpperCase;
        List<String> list = Arrays.asList("bola", "mala", "js", "php", "java");

        list.forEach(s -> System.out.println(textConverter.convert(s)));
    }
}

//2. **Converter para Maiúsculas**
//- Defina uma interface `TextConverter` com um método `convert` que converta
//uma string para maiúsculas. Use uma referência a método para aplicar essa
// conversão em uma lista de strings.
