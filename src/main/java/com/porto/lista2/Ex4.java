package com.porto.lista2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(10, 21, 45, 100, 201, 305);
        Function<Integer, Integer> sqrt = e -> (int) Math.pow(e, 2);
        List<Integer> quadrados = inteiros.stream()
                .map(sqrt)
                .toList();

        System.out.println(quadrados);
    }
}


//4. **Transformação de Lista**
//- Dada uma lista de inteiros, use a interface `Function`
//para criar uma nova lista onde cada elemento é o quadrado
//      do elemento original. Imprima a lista resultante.
