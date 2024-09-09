package com.porto.exerciciosMetodosDefaultStatic;

import com.porto.interfaces.Info;
import com.porto.models.Produto;

public class Ex3 {
    public static void main(String[] args) {
        Produto produto = new Produto("Tênis", 1200);

        produto.displayInfo(produto);
    }
}

//3. **Exibir Informações**
//- Crie uma interface `Info` com um método `default` chamado `displayInfo` que
//exiba informações sobre um objeto. Implemente uma classe `Product` que use
//esse método para mostrar detalhes de um produto.
