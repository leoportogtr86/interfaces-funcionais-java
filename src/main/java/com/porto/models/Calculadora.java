package com.porto.models;

import com.porto.interfaces.OperacaoMatematica;

public class Calculadora {
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static OperacaoMatematica multiplicacao = Calculadora::multiplicar;
}


//3. **Referências a Métodos:**
//- Crie uma classe chamada `Calculadora` que tenha um método estático
//`multiplicar(int a, int b)`. Use uma referência
//a método para implementar a interface `OperacaoMatematica` de modo que o método `calcular` chame o
//método `multiplicar` da classe `Calculadora`.
