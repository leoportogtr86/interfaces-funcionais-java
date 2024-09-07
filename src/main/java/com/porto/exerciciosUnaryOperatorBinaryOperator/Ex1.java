package com.porto.exerciciosUnaryOperatorBinaryOperator;

import java.util.function.UnaryOperator;

public class Ex1 {
    public static void main(String[] args) {
        UnaryOperator<String> toLower = String::toLowerCase;

        System.out.println(toLower.apply("BoLA"));
    }
}

//1. **Converter para Minúsculas**
//- Crie um `UnaryOperator<String>` que converta uma string para minúsculas
//e aplique-o a uma string de sua escolha.
