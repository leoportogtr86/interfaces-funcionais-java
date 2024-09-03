package com.porto.lista2;

import java.util.function.Function;

public class Ex1 {
    public static void main(String[] args) {
        Function<String, Integer> toInt = Integer::parseInt;

        System.out.println(toInt.apply("4"));
    }
}


//1. **Transformação Simples**
//- Crie uma função `Function<String, Integer>` que converta uma
//string que representa um número em um inteiro. Teste
//essa função com algumas strings representando números.
