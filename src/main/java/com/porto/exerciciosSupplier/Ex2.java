package com.porto.exerciciosSupplier;

import java.util.Random;
import java.util.function.Supplier;

public class Ex2 {
    public static void main(String[] args) {
        Supplier<String> senhaAleatoria = () -> {
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder senha = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                senha.append(caracteres.charAt(random.nextInt(caracteres.length())));
            }
            return senha.toString();
        };

        System.out.println("Senha gerada: " + senhaAleatoria.get());
    }
}

//2. **Geração de Senha**
//- Implemente um `Supplier<String>` que gere uma senha aleatória
//com 10 caracteres. Use caracteres alfanuméricos e
//imprima a senha gerada.
