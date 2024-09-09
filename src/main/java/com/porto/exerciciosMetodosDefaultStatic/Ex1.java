package com.porto.exerciciosMetodosDefaultStatic;

import com.porto.models.Person;

public class Ex1 {
    public static void main(String[] args) {
        Person person = new Person("Joe", 41);

        System.out.println(person.greetWithTitle("Joe"));;
    }
}

//1. **Método de Saudações**
//- Crie uma interface `Greeting` com um método `default` chamado `greetWithTitle`
//que receba um nome e um título e retorne uma saudação formatada (por exemplo, "Hello, Dr. Smith!"). Implemente uma classe
// `Person` que use esse método.
