# Lista de 10 exercícios baseados no artigo sobre interfaces funcionais em Java:

### **Exercícios**

1. **Definição de Interface Funcional:**
    - Crie uma interface funcional chamada `OperacaoMatematica` que contenha um único método
      abstrato `calcular(int a, int b)`. Implemente essa interface usando uma expressão lambda para realizar uma
      operação de subtração.

2. **Uso de `@FunctionalInterface`:**
    - Adicione a anotação `@FunctionalInterface` à interface `OperacaoMatematica` criada no exercício anterior. Explique
      o que aconteceria se você tentasse adicionar um segundo método abstrato à interface.

3. **Referências a Métodos:**
    - Crie uma classe chamada `Calculadora` que tenha um método estático `multiplicar(int a, int b)`. Use uma referência
      a método para implementar a interface `OperacaoMatematica` de modo que o método `calcular` chame o
      método `multiplicar` da classe `Calculadora`.

4. **Interfaces Funcionais Padrão - `Predicate<T>`:**
    - Crie uma lista de números inteiros e use a interface funcional `Predicate<Integer>` para filtrar e imprimir apenas
      os números ímpares da lista.

5. **Interfaces Funcionais Padrão - `Function<T, R>`:**
    - Implemente uma função que converta uma lista de Strings em uma lista de seus respectivos comprimentos usando a
      interface `Function<String, Integer>`.

6. **Composição de Funções:**
    - Crie duas funções `Function<String, String>` que realizem operações de formatação em textos. A primeira função
      deve converter um texto para maiúsculas, e a segunda deve adicionar um ponto final ao final da String. Use o
      método `andThen` para compor essas duas funções em uma terceira função que realize ambas as operações.

7. **Uso de `Consumer<T>`:**
    - Crie uma lista de Strings e use a interface `Consumer<String>` para imprimir cada elemento da lista em uma linha
      separada.

8. **Implementação de Interface Funcional Customizada:**
    - Crie uma interface funcional chamada `Conversor` que tenha um método `converter(String entrada)`. Implemente essa
      interface usando uma expressão lambda que converta uma String em sua representação numérica inteira.

9. **Manipulação de Exceções em Lambdas:**
    - Implemente uma expressão lambda que divide dois números inteiros e retorna o resultado. Modifique a expressão
      lambda para tratar uma possível divisão por zero, retornando um valor padrão caso ocorra essa exceção.

10. **Criação de Interface Funcional `Supplier<T>`:**
    - Crie uma implementação da interface `Supplier<String>` que retorne uma saudação aleatória toda vez que o
      método `get()` for chamado.

Esses exercícios são projetados para ajudar a reforçar os conceitos de interfaces funcionais em Java e promover a
prática com diferentes interfaces e padrões de uso.