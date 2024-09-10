package com.porto.exerciciosReferenciaContrutores;

import com.porto.interfaces.Printer;

public class Ex1 {
    public static void main(String[] args) {
        Printer printer = System.out::println;

        printer.print("Exercício 1");
    }
}

//1. **Imprimir Mensagem**
//- Crie uma interface `Printer` com um método `print`
// que receba uma string. Utilize uma referência a método para
//imprimir uma mensagem usando a classe `Printer`.
