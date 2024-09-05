package com.porto.exerciciosConsumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        Consumer<Double> printSalarioComAumento = e -> System.out.println(e + e * 0.05);

        Stream.of(100.0, 5000.0, 7898.0, 10232.0)
                .forEach(printSalarioComAumento);
    }
}


//3. **Atualização de Salários**
//- Crie um `Consumer<Double>` que aumenta um salário em 5%.
//Aplique esse `Consumer` a uma lista de salários e imprima
//os salários atualizados.
