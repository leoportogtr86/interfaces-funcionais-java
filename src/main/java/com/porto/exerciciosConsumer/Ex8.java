package com.porto.exerciciosConsumer;

import java.util.List;
import java.util.function.Consumer;

public class Ex8 {
    public static void main(String[] args) {
        Consumer<String> logOperation = e -> System.out.println("Operação: " + e);
        List<String> operations = List.of("op1", "op2", "op3", "op4", "op5");

        operations.forEach(logOperation);
    }
}


//8. **Log de Operações**
//- Crie um `Consumer<String>` que registra uma operação
//com um prefixo "Operação: ". Aplique esse `Consumer` a uma
//lista de operações.
