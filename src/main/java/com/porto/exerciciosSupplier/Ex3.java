package com.porto.exerciciosSupplier;

import com.porto.models.Produto;

import java.util.function.Supplier;

public class Ex3 {
    public static void main(String[] args) {
        Supplier<Produto> produtoSupplier = () -> new Produto("Laptop", 5698.89);

        System.out.println(produtoSupplier.get().toString());
    }
}


//3. **Fabricante de Produtos**
//- Crie um `Supplier<Produto>` que forneça uma instância de `Produto`
//com um nome e um preço fixos. Aplique
//o `Supplier` para criar e imprimir um produto.
