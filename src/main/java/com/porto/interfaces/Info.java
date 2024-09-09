package com.porto.interfaces;

import com.porto.models.Produto;

public interface Info {
    default void displayInfo(Produto produto) {
        System.out.println(produto.toString());
    }
}

//3. **Exibir Informações**
//- Crie uma interface `Info` com um método `default` chamado `displayInfo` que
//exiba informações sobre um objeto. Implemente uma classe `Product` que use
//esse método para mostrar detalhes de um produto.
