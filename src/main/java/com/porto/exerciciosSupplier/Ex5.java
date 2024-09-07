package com.porto.exerciciosSupplier;

import java.util.UUID;
import java.util.function.Supplier;

public class Ex5 {
    public static void main(String[] args) {
        Supplier<String> senhaSupplier = () -> UUID.randomUUID().toString();

        System.out.println(senhaSupplier.get());
    }
}

//5. **Geração de Identificadores**
//- Crie um `Supplier<String>` que gere um identificador único
//(UUID) e imprima o resultado.
