Aqui estão 20 exercícios para praticar o uso de referências de métodos e construtores em Java:

### Exercícios com Referências de Métodos

1. **Imprimir Mensagem**
    - Crie uma interface `Printer` com um método `print` que receba uma string. Utilize uma referência a método para
      imprimir uma mensagem usando a classe `Printer`.

2. **Converter para Maiúsculas**
    - Defina uma interface `TextConverter` com um método `convert` que converta uma string para maiúsculas. Use uma
      referência a método para aplicar essa conversão em uma lista de strings.

3. **Ordenar Lista de Números**
    - Crie uma lista de números inteiros e utilize uma referência a método para ordenar a lista em ordem crescente.

4. **Filtrar Strings**
    - Defina uma interface `StringFilter` com um método `filter` que verifique se uma string tem mais de 5 caracteres.
      Utilize uma referência a método para filtrar uma lista de strings.

5. **Calcular Raiz Quadrada**
    - Crie uma interface `MathOperations` com um método `sqrt` que calcule a raiz quadrada de um número. Utilize uma
      referência a método para aplicar essa operação a uma lista de números.

6. **Comparar Strings**
    - Defina uma interface `StringComparator` com um método `compare` que compare duas strings. Utilize uma referência a
      método para ordenar uma lista de strings com base na comparação.

7. **Transformar Data**
    - Crie uma classe `DateUtils` com um método `formatDate` que formate uma data em um formato específico. Use uma
      referência a método para formatar uma lista de datas.

8. **Verificar Números Pares**
    - Defina uma interface `EvenChecker` com um método `isEven` que verifique se um número é par. Utilize uma referência
      a método para filtrar uma lista de números inteiros.

9. **Converter Strings para Inteiros**
    - Crie uma interface `StringParser` com um método `parse` que converta uma string em um número inteiro. Utilize uma
      referência a método para converter uma lista de strings em uma lista de inteiros.

10. **Formatar Preços**
    - Defina uma interface `PriceFormatter` com um método `format` que formate um preço em uma string monetária. Utilize
      uma referência a método para formatar uma lista de preços.

### Exercícios com Referências a Construtores

11. **Criar Objetos de Pessoa**
    - Crie uma interface `PersonFactory` com um método `create` que crie uma instância de `Person` com um nome dado.
      Utilize uma referência ao construtor para criar uma lista de objetos `Person` a partir de uma lista de nomes.

12. **Gerar Instâncias de Classe**
    - Defina uma interface `ObjectFactory` com um método `create` que crie uma instância de uma classe genérica. Utilize
      uma referência ao construtor para criar instâncias de diferentes tipos de classes.

13. **Criar Strings**
    - Crie uma interface `StringFactory` com um método `create` que crie uma nova instância de uma string com um valor
      padrão. Utilize uma referência ao construtor para criar uma lista de strings.

14. **Criar Objetos de Produto**
    - Defina uma interface `ProductFactory` com um método `create` que crie uma instância de `Product` com um nome e um
      preço. Utilize uma referência ao construtor para criar uma lista de produtos a partir de uma lista de dados.

15. **Gerar Objetos de Conta**
    - Crie uma interface `AccountFactory` com um método `create` que crie uma nova instância de `Account` com um número
      e um saldo. Utilize uma referência ao construtor para criar uma lista de contas a partir de uma lista de dados.

16. **Instanciar Objetos de Configuração**
    - Defina uma interface `ConfigFactory` com um método `create` que crie uma nova instância de `Configuration` com
      parâmetros específicos. Utilize uma referência ao construtor para criar uma lista de configurações.

17. **Criar Instâncias de Vetor**
    - Crie uma interface `VectorFactory` com um método `create` que crie uma nova instância de `Vector` com um tamanho e
      valores iniciais. Utilize uma referência ao construtor para criar uma lista de vetores.

18. **Criar Objetos de Livro**
    - Defina uma interface `BookFactory` com um método `create` que crie uma nova instância de `Book` com um título e um
      autor. Utilize uma referência ao construtor para criar uma lista de livros.

19. **Gerar Objetos de Pedido**
    - Crie uma interface `OrderFactory` com um método `create` que crie uma nova instância de `Order` com um
      identificador e uma lista de itens. Utilize uma referência ao construtor para criar uma lista de pedidos.

20. **Instanciar Objetos de Cliente**
    - Defina uma interface `CustomerFactory` com um método `create` que crie uma nova instância de `Customer` com um
      nome e um e-mail. Utilize uma referência ao construtor para criar uma lista de clientes.

### Exemplos de Implementação

Aqui estão exemplos de como você pode implementar e testar alguns dos exercícios acima:

```java
import java.util.*;
import java.util.function.*;

public class MethodAndConstructorReferences {

    // Exercício 1: Imprimir Mensagem
    public interface Printer {
        void print(String message);
    }

    public static class Example1 {
        public static void main(String[] args) {
            Printer printer = System.out::println;
            printer.print("Hello, World!");
        }
    }

    // Exercício 11: Criar Objetos de Pessoa
    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "'}";
        }
    }

    public interface PersonFactory {
        Person create(String name);
    }

    public static class Example11 {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
            List<Person> people = names.stream()
                    .map(Person::new)
                    .collect(Collectors.toList());
            people.forEach(System.out::println);
        }
    }

    // Exercício 15: Gerar Objetos de Conta
    public static class Account {
        private int number;
        private double balance;

        public Account(int number, double balance) {
            this.number = number;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account{number=" + number + ", balance=" + balance + "}";
        }
    }

    public interface AccountFactory {
        Account create(int number, double balance);
    }

    public static class Example15 {
        public static void main(String[] args) {
            List<Account> accounts = Arrays.asList(
                    new Account(101, 1000.0),
                    new Account(102, 1500.0),
                    new Account(103, 2000.0)
            );
            accounts.forEach(System.out::println);
        }
    }
}
```

Esses exercícios ajudarão a praticar o uso de referências de métodos e construtores, facilitando a compreensão de como
essas ferramentas podem simplificar o código em Java.