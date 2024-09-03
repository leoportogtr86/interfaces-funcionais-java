package com.porto.lista2;

import java.util.function.Function;

public class Ex6 {
    public static void main(String[] args) {
        Function<String, String> removeEspacosExternos = String::trim;

        System.out.println(removeEspacosExternos.apply("   Olá Mundo!   "));
        System.out.println("   Olá Mundo!   ");
    }
}

//6. **Remoção de Espaços**
//- Crie uma função `Function<String, String>` que
//remove espaços em branco no início e no final de uma string. Teste
//a função com a string `"   Olá Mundo!   "`.
