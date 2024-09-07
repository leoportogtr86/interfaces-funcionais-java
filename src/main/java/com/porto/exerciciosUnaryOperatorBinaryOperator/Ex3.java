package com.porto.exerciciosUnaryOperatorBinaryOperator;

import java.util.function.UnaryOperator;

public class Ex3 {
    public static void main(String[] args) {
        UnaryOperator<String> reverse = e -> new StringBuilder(e).reverse().toString();

        System.out.println(reverse.apply("teste"));
    }
}

//3. **Inverter uma String**
//- Crie um `UnaryOperator<String>` que inverta uma string
//e aplique-o a uma string de sua escolha.
