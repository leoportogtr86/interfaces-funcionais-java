package com.porto.exerciciosConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex6 {
    public static void main(String[] args) {
        Consumer<String> printErrors = e -> System.out.println("Erro: " + e);
        List<String> erros = Arrays.asList("500", "Dado nao encontrado", "Banco indisponivel");

        erros.forEach(printErrors);
    }
}

//6. **Impressão de Mensagens de Erro**
//- Implemente um `Consumer<String>` que imprime uma
//mensagem de erro com um prefixo "Erro: ". Aplique esse `Consumer`
//a uma lista de mensagens de erro.
