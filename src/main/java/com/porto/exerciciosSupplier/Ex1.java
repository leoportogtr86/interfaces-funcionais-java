package com.porto.exerciciosSupplier;

import com.porto.models.Pessoa;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class Ex1 {
    public static void main(String[] args) {
        Supplier<Pessoa> pessoaSupplier = () -> new Pessoa(UUID.randomUUID().toString(), new Random().nextInt());

        System.out.println(pessoaSupplier.get().getNome());
        System.out.println(pessoaSupplier.get().getIdade());
    }
}

//1. **Criação de Pessoa**
//        - Crie um `Supplier<Pessoa>` que forneça uma nova instância de
//        `Pessoa` com nome e idade aleatórios. Aplique
//o `Supplier` para criar e imprimir uma pessoa.
