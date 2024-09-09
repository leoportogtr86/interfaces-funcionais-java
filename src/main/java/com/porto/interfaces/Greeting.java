package com.porto.interfaces;

public interface Greeting {
    default String greetWithTitle(String nome) {
        return "Hello, Dr. " + nome;
    }
}

//1. **Método de Saudações**
//- Crie uma interface `Greeting` com um método `default` chamado `greetWithTitle` que
//receba um nome e um título e retorne uma saudação formatada (por exemplo, "Hello, Dr.
//Smith!"). Implemente uma classe `Person` que use esse método.