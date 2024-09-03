# 10 exercícios práticos para praticar o uso da interface `Predicate<T>` em Java:

### Exercícios sobre a Interface `Predicate<T>`

1. **Filtro de Números Ímpares**
    - Crie um `Predicate<Integer>` que verifica se um número é ímpar. Use este predicado para filtrar uma lista de
      inteiros e retornar apenas os números ímpares.

2. **Verificação de Palavras com Mais de 5 Letras**
    - Implemente um `Predicate<String>` que verifica se uma string tem mais de 5 letras. Aplique esse predicado em uma
      lista de palavras e retorne as palavras que atendem a essa condição.

3. **Filtragem de Idades para Maioridade**
    - Crie um `Predicate<Integer>` que verifica se uma pessoa é maior de idade (18 anos ou mais). Use esse predicado
      para filtrar uma lista de idades e retornar as idades que representam pessoas maiores de idade.

4. **Palavras que Começam com 'J'**
    - Crie um `Predicate<String>` que verifica se uma string começa com a letra 'J'. Aplique esse predicado em uma lista
      de nomes e retorne os nomes que começam com 'J'.

5. **Número Dentro de um Intervalo**
    - Crie um `Predicate<Integer>` que verifica se um número está dentro do intervalo de 10 a 20 (inclusive). Use esse
      predicado para filtrar uma lista de números e retornar apenas os que estão dentro do intervalo.

6. **Verificação de String Nula ou Vazia**
    - Implemente um `Predicate<String>` que verifica se uma string é nula ou vazia. Aplique esse predicado a uma lista
      de strings e retorne as strings que são nulas ou vazias.

7. **Número Divisível por 5**
    - Crie um `Predicate<Integer>` que verifica se um número é divisível por 5. Use esse predicado para filtrar uma
      lista de números e retornar apenas aqueles que são divisíveis por 5.

8. **Palavras com Consoantes Específicas**
    - Implemente um `Predicate<String>` que verifica se uma string contém a consoante 'r'. Aplique esse predicado a uma
      lista de palavras e retorne as palavras que contêm a consoante 'r'.

9. **Filtro de Strings com Comprimento Par**
    - Crie um `Predicate<String>` que verifica se o comprimento de uma string é par. Use esse predicado para filtrar uma
      lista de strings e retornar apenas aquelas com comprimento par.

10. **Número Positivo e Menor que 50**
    - Crie um `Predicate<Integer>` que verifica se um número é positivo e menor que 50. Aplique esse predicado em uma
      lista de números e retorne os números que atendem a essa condição.

### Exemplos de Implementação

Aqui está um exemplo de como você pode implementar e testar alguns desses exercícios:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploPredicados {
    public static void main(String[] args) {
        // Exercício 1: Filtro de Números Ímpares
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> eImpar = numero -> numero % 2 != 0;
        List<Integer> numerosImpares = numeros.stream()
                .filter(eImpar)
                .collect(Collectors.toList());
        System.out.println("Números ímpares: " + numerosImpares);

        // Exercício 2: Verificação de Palavras com Mais de 5 Letras
        List<String> palavras = Arrays.asList("java", "python", "javascript", "c++", "go");
        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;
        List<String> palavrasLongas = palavras.stream()
                .filter(maisDeCincoLetras)
                .collect(Collectors.toList());
        System.out.println("Palavras com mais de 5 letras: " + palavrasLongas);

        // Exercício 3: Filtragem de Idades para Maioridade
        List<Integer> idades = Arrays.asList(15, 20, 17, 22, 16, 30);
        Predicate<Integer> maiorDeIdade = idade -> idade >= 18;
        List<Integer> maioresDeIdade = idades.stream()
                .filter(maiorDeIdade)
                .collect(Collectors.toList());
        System.out.println("Pessoas maiores de idade: " + maioresDeIdade);

        // Exercício 4: Palavras que Começam com 'J'
        Predicate<String> comecaComJ = palavra -> palavra.startsWith("J");
        List<String> nomes = Arrays.asList("João", "Ana", "Juliana", "Pedro");
        List<String> nomesComJ = nomes.stream()
                .filter(comecaComJ)
                .collect(Collectors.toList());
        System.out.println("Nomes que começam com 'J': " + nomesComJ);
    }
}
```

Esses exercícios ajudarão a fortalecer a compreensão da interface `Predicate<T>` e sua aplicação em diferentes cenários
de filtragem e testes.