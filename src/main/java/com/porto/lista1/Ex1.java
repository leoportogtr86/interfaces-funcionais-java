package com.porto.lista1;

import com.porto.interfaces.OperacaoMatematica;

public class Ex1 {
    public static void main(String[] args) {
        OperacaoMatematica subtracao = (a, b) -> a - b;

        System.out.println(subtracao.calcular(10, 4));
    }
}


//1. **Definição de Interface Funcional:**
//- Crie uma interface funcional chamada `OperacaoMatematica` que
//contenha um único método
//abstrato `calcular(int a, int b)`. Implemente essa interface usando uma
// expressão lambda para realizar uma
//operação de subtração.

//2. **Uso de `@FunctionalInterface`:**
//        - Adicione a anotação `@FunctionalInterface` à interface `OperacaoMatematica`
//        criada no exercício anterior. Explique
//o que aconteceria se você tentasse adicionar um segundo método abstrato à interface. => daria erro
