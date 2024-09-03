package com.porto.lista2;

import java.util.function.Function;

public class Ex5 {
    public static void main(String[] args) {
        Function<Integer, Integer> dobro = e -> e * 2;
        Function<Integer, Integer> add10 = e -> e + 10;

        System.out.println(dobro.andThen(add10).apply(10));
    }
}

//5. **Função Composta**
//- Crie duas funções `Function<Integer, Integer>`: uma que dobra o
//valor e outra que adiciona 10 ao valor. Componha
//essas funções para criar uma nova função que dobre o valor
// e depois adicione 10. Teste a nova função com o valor
//      5.
