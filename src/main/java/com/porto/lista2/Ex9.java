package com.porto.lista2;

import java.util.Arrays;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<String> numerosStr = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numerosInt = numerosStr.stream().map(Integer::parseInt).toList();

        System.out.println(numerosInt);
    }
}

//9. **Mapeamento de Lista**
//- Dada uma lista de strings representando números em formato
//textual, use uma função `Function<String, Integer>`
//para converter cada string em um inteiro e colecione os resultados
// em uma nova lista. Imprima a lista resultante.
