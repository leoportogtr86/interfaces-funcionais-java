package com.porto.lista1;

import com.porto.interfaces.Conversor;

public class Ex8 {
    public static void main(String[] args) {
        Conversor conversor = Integer::parseInt;

        System.out.println(conversor.converter("1"));
    }
}

//8. **Implementação de Interface Funcional Customizada:**
//- Crie uma interface funcional chamada `Conversor` que tenha um
//método `converter(String entrada)`. Implemente essa
//interface usando uma expressão lambda que converta uma
// String em sua representação numérica inteira.
