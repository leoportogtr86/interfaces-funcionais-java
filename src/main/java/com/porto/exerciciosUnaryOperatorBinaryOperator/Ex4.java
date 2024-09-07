package com.porto.exerciciosUnaryOperatorBinaryOperator;

import java.util.function.UnaryOperator;

public class Ex4 {
    public static void main(String[] args) {
        UnaryOperator<String> removeEspacos = e -> e.replaceAll(" ", "");

        System.out.println(removeEspacos.apply("hello world"));
    }
}

//4. **Remover Espaços em Branco**
//- Implemente um `UnaryOperator<String>` que remova espaços \
//em branco de uma string e aplique-o a uma string com
//espaços.
