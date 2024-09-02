package com.porto.lista1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> impar = e -> e % 2 != 0;

        inteiros.stream()
                .filter(impar)
                .forEach(System.out::println);
    }
}

//4. **Interfaces Funcionais Padrão - `Predicate<T>`:**
//- Crie uma lista de números inteiros e use a interface
//funcional `Predicate<Integer>` para filtrar e imprimir apenas
//os números ímpares da lista.
