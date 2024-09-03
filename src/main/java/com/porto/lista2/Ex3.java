package com.porto.lista2;

import java.util.function.Function;

public class Ex3 {
    public static void main(String[] args) {
        Function<String, Integer> len = String::length;

        System.out.println(len.apply("bola"));
        System.out.println(len.apply("cardapio"));
        System.out.println(len.apply("suficiente"));
    }
}

//3. **Função de Comprimento**
//- Crie uma função `Function<String, Integer>` que calcula o
//comprimento de uma string. Use essa função para calcular
//e imprimir o comprimento de diferentes palavras.
