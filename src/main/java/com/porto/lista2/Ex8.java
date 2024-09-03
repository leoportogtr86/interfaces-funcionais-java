package com.porto.lista2;

import java.util.function.Function;

public class Ex8 {
    public static void main(String[] args) {
        Function<String, String> toLower = String::toLowerCase;
        Function<String, String> toUpper = String::toUpperCase;

        System.out.println(toLower.andThen(toUpper).apply("Exemplo"));
    }
}


//8. **Maiúsculas e Minúsculas**
//- Crie uma função `Function<String, String>` que converte
//uma string para minúsculas e, em seguida, aplique uma
//função `Function<String, String>` que converte uma string para maiúsculas.
// Componha essas funções para garantir
//que a string resultante esteja em maiúsculas. Teste com a string `"Exemplo"`.
