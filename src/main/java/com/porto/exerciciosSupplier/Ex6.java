package com.porto.exerciciosSupplier;

import java.util.function.Supplier;

public class Ex6 {
    public static void main(String[] args) {
        Supplier<String> conexaoSupplier = () -> "jdbc:mysql://localhost:3306/banco";

        System.out.println(conexaoSupplier.get());
    }
}

//6. **Configuração de Banco de Dados**
//- Implemente um `Supplier<ConexaoBanco>` que forneça uma
//conexão com um URL específico. Use o `Supplier` para criar
//e imprimir a conexão.
