package com.porto.lista2;

import java.util.function.Function;

public class Ex2 {
    public static void main(String[] args) {
        Function<Double, Double> celsiustoFahrenheit = c -> c * 9/5 + 32;

        System.out.println(celsiustoFahrenheit.apply(36.0));
    }
}

//2. **Conversão de Temperatura**
//- Implemente uma função `Function<Double, Double>` que
//converta uma temperatura de Celsius para Fahrenheit. Teste a
//função com uma temperatura de 25°C.
