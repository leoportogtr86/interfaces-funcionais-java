Aqui estão 20 exercícios para praticar o uso das interfaces `UnaryOperator<T>` e `BinaryOperator<T>` em Java:

### Exercícios sobre `UnaryOperator<T>` e `BinaryOperator<T>`

#### Exercícios com `UnaryOperator<T>`

1. **Converter para Minúsculas**
    - Crie um `UnaryOperator<String>` que converta uma string para minúsculas e aplique-o a uma string de sua escolha.

2. **Quadrado de um Número**
    - Implemente um `UnaryOperator<Integer>` que calcule o quadrado de um número inteiro e aplique-o a um valor.

3. **Inverter uma String**
    - Crie um `UnaryOperator<String>` que inverta uma string e aplique-o a uma string de sua escolha.

4. **Remover Espaços em Branco**
    - Implemente um `UnaryOperator<String>` que remova espaços em branco de uma string e aplique-o a uma string com
      espaços.

5. **Calcular o Fatorial**
    - Crie um `UnaryOperator<Integer>` que calcule o fatorial de um número e aplique-o a um valor.

6. **Adicionar Prefixo**
    - Implemente um `UnaryOperator<String>` que adicione um prefixo a uma string e aplique-o a uma string de sua
      escolha.

7. **Formatar Data**
    - Crie um `UnaryOperator<LocalDate>` que formate uma data no padrão "dd/MM/yyyy" e aplique-o a uma data.

8. **Converter Temperatura**
    - Implemente um `UnaryOperator<Double>` que converta uma temperatura de Celsius para Fahrenheit e aplique-o a um
      valor.

9. **Dobrar um Valor**
    - Crie um `UnaryOperator<Double>` que dobre um valor e aplique-o a um número.

10. **Remover Caracteres Especiais**
    - Implemente um `UnaryOperator<String>` que remova caracteres especiais de uma string e aplique-o a uma string com
      caracteres especiais.

#### Exercícios com `BinaryOperator<T>`

11. **Soma de Dois Números**
    - Crie um `BinaryOperator<Integer>` que calcule a soma de dois números inteiros e aplique-o a dois valores.

12. **Subtração de Dois Números**
    - Implemente um `BinaryOperator<Integer>` que calcule a subtração de dois números inteiros e aplique-o a dois
      valores.

13. **Concatenar Strings**
    - Crie um `BinaryOperator<String>` que concatene duas strings e aplique-o a duas strings.

14. **Multiplicação de Dois Números**
    - Implemente um `BinaryOperator<Integer>` que calcule a multiplicação de dois números inteiros e aplique-o a dois
      valores.

15. **Encontrar o Menor Valor**
    - Crie um `BinaryOperator<Integer>` que encontre o menor valor entre dois inteiros e aplique-o a dois valores.

16. **Calcular Média**
    - Implemente um `BinaryOperator<Double>` que calcule a média de dois números e aplique-o a dois valores.

17. **Combinar Duas Listas**
    - Crie um `BinaryOperator<List<String>>` que combine duas listas de strings em uma só e aplique-o a duas listas.

18. **Calcular Mínimo e Máximo**
    - Implemente um `BinaryOperator<Integer>` que calcule o mínimo e máximo entre dois números inteiros e aplique-o a
      dois valores.

19. **Criar Nome Completo**
    - Crie um `BinaryOperator<String>` que combine um nome e sobrenome em um nome completo e aplique-o a um nome e
      sobrenome.

20. **Combinar Horários**
    - Implemente um `BinaryOperator<LocalTime>` que combine dois horários em um intervalo e aplique-o a dois horários.

### Exemplos de Implementação

Aqui estão alguns exemplos de como implementar e testar alguns desses exercícios:

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ExemploOperators {

    public static void main(String[] args) {
        // Exercício 1: Converter para Minúsculas
        UnaryOperator<String> toLowerCase = s -> s.toLowerCase();
        System.out.println(toLowerCase.apply("Hello WORLD!")); // Output: hello world!

        // Exercício 2: Quadrado de um Número
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(5)); // Output: 25

        // Exercício 3: Inverter uma String
        UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverse.apply("Java")); // Output: avaJ

        // Exercício 4: Remover Espaços em Branco
        UnaryOperator<String> removeSpaces = s -> s.replaceAll("\\s+", "");
        System.out.println(removeSpaces.apply("Hello World!")); // Output: HelloWorld!

        // Exercício 5: Calcular o Fatorial
        UnaryOperator<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.apply(5)); // Output: 120

        // Exercício 6: Adicionar Prefixo
        UnaryOperator<String> addPrefix = s -> "Prefix_" + s;
        System.out.println(addPrefix.apply("Test")); // Output: Prefix_Test

        // Exercício 7: Formatar Data
        UnaryOperator<LocalDate> formatDate = date -> date;
        System.out.println(formatDate.apply(LocalDate.of(2024, 9, 1))); // Output: 2024-09-01

        // Exercício 8: Converter Temperatura
        UnaryOperator<Double> celsiusToFahrenheit = c -> c * 9 / 5 + 32;
        System.out.println(celsiusToFahrenheit.apply(25.0)); // Output: 77.0

        // Exercício 9: Dobrar um Valor
        UnaryOperator<Double> doubleValue = d -> d * 2;
        System.out.println(doubleValue.apply(7.5)); // Output: 15.0

        // Exercício 10: Remover Caracteres Especiais
        UnaryOperator<String> removeSpecialChars = s -> s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(removeSpecialChars.apply("Hello@World!")); // Output: HelloWorld

        // Exercício 11: Soma de Dois Números
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 10)); // Output: 15

        // Exercício 12: Subtração de Dois Números
        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        System.out.println(subtract.apply(10, 5)); // Output: 5

        // Exercício 13: Concatenar Strings
        BinaryOperator<String> concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.apply("Hello, ", "World!")); // Output: Hello, World!

        // Exercício 14: Multiplicação de Dois Números
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(4, 5)); // Output: 20

        // Exercício 15: Encontrar o Menor Valor
        BinaryOperator<Integer> min = (a, b) -> a < b ? a : b;
        System.out.println(min.apply(7, 10)); // Output: 7

        // Exercício 16: Calcular Média
        BinaryOperator<Double> average = (a, b) -> (a + b) / 2;
        System.out.println(average.apply(10.0, 20.0)); // Output: 15.0

        // Exercício 17: Combinar Duas Listas
        BinaryOperator<List<String>> combineLists = (list1, list2) -> {
            List<String> combined = new ArrayList<>(list1);
            combined.addAll(list2);
            return combined;
        };
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.of("C", "D");
        System.out.println(combineLists.apply(list1, list2)); // Output: [A, B, C, D]

        // Exercício 18: Calcular Mínimo e Máximo
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;
        System.out.println(max.apply(7, 10)); // Output: 10

        // Exercício 19: Criar Nome Completo
        BinaryOperator<String> fullName = (firstName, lastName) -> firstName + " " + lastName;
        System.out.println(fullName.apply("John", "Doe")); // Output: John Doe

        // Exercício 20: Combinar Horários
        BinaryOperator<LocalTime> combineTimes = (time1, time2) -> time1.plusHours(time2.getHour()).plusMinutes(time2.getMinute());
        System.out.println(combineTimes.apply(LocalTime.of(10, 30), LocalTime.of(1, 45))); // Output: 12:15
    }


}
```

Esses exercícios abrangem uma variedade de cenários para ajudar a entender melhor como usar `UnaryOperator<T>`
e `BinaryOperator<T>` em diferentes contextos.