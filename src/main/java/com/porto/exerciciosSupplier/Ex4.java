package com.porto.exerciciosSupplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Ex4 {
    public static void main(String[] args) {
        Supplier<LocalDate> dateSupplier = LocalDate::now;

        System.out.println(dateSupplier.get());
    }
}

//4. **Gerador de Data**
//- Implemente um `Supplier<LocalDate>` que forneça a data atual.
//Use o `Supplier` para obter e imprimir a data atual.
