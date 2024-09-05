Aqui estão 20 exercícios para praticar o uso da interface `Consumer<T>` em Java:

### Exercícios sobre a Interface `Consumer<T>`

1. **Impressão de Inteiros**
    - Crie um `Consumer<Integer>` que imprime um número inteiro. Aplique esse `Consumer` a uma lista de números inteiros
      e imprima todos os números.

2. **Conversão para Maiúsculas**
    - Implemente um `Consumer<String>` que converte uma string para maiúsculas e imprime o resultado. Aplique
      esse `Consumer` a uma lista de strings.

3. **Atualização de Salários**
    - Crie um `Consumer<Double>` que aumenta um salário em 5%. Aplique esse `Consumer` a uma lista de salários e imprima
      os salários atualizados.

4. **Contagem de Caracteres**
    - Crie um `Consumer<String>` que conta e imprime o número de caracteres em uma string. Aplique esse `Consumer` a uma
      lista de palavras e imprima a contagem para cada uma.

5. **Prefixo de Strings**
    - Crie um `Consumer<String>` que adiciona o prefixo "Prefixo_" a uma string e imprime o resultado. Aplique
      esse `Consumer` a uma lista de strings.

6. **Impressão de Mensagens de Erro**
    - Implemente um `Consumer<String>` que imprime uma mensagem de erro com um prefixo "Erro: ". Aplique esse `Consumer`
      a uma lista de mensagens de erro.

7. **Multiplicação de Números**
    - Crie um `Consumer<Integer>` que multiplica um número por 10 e imprime o resultado. Aplique esse `Consumer` a uma
      lista de números inteiros.

8. **Log de Operações**
    - Crie um `Consumer<String>` que registra uma operação com um prefixo "Operação: ". Aplique esse `Consumer` a uma
      lista de operações.

9. **Ajuste de Preços**
    - Implemente um `Consumer<Double>` que aplica um desconto de 10% a um preço e imprime o preço ajustado. Aplique
      esse `Consumer` a uma lista de preços.

10. **Impressão de Nomes com Sobrenome**
    - Crie um `Consumer<String>` que adiciona o sobrenome "Silva" a um nome e imprime o resultado. Aplique
      esse `Consumer` a uma lista de nomes.

11. **Registro de Informações de Usuário**
    - Implemente um `Consumer<String>` que registra informações de usuário no formato "Usuário: [nome]". Aplique
      esse `Consumer` a uma lista de nomes de usuários.

12. **Verificação de Idade**
    - Crie um `Consumer<Integer>` que verifica se uma idade é maior ou igual a 18 e imprime a mensagem "Maior de idade"
      ou "Menor de idade". Aplique esse `Consumer` a uma lista de idades.

13. **Conversão de Números para Strings**
    - Implemente um `Consumer<Integer>` que converte um número para uma string e imprime a representação. Aplique
      esse `Consumer` a uma lista de números inteiros.

14. **Remoção de Espaços em Branco**
    - Crie um `Consumer<String>` que remove espaços em branco do início e fim de uma string e imprime o resultado.
      Aplique esse `Consumer` a uma lista de strings.

15. **Impressão de Resultados de Testes**
    - Crie um `Consumer<String>` que imprime o resultado de um teste com a mensagem "Resultado do teste: [resultado]".
      Aplique esse `Consumer` a uma lista de resultados de testes.

16. **Formatação de Data**
    - Implemente um `Consumer<String>` que formata uma data no formato "dd/MM/yyyy" e imprime a data formatada. Aplique
      esse `Consumer` a uma lista de datas no formato "yyyy-MM-dd".

17. **Aplicação de Correção**
    - Crie um `Consumer<String>` que aplica uma correção em um texto substituindo "erro" por "correção" e imprime o
      texto corrigido. Aplique esse `Consumer` a uma lista de textos.

18. **Criação de Mensagens de Boas-vindas**
    - Implemente um `Consumer<String>` que cria uma mensagem de boas-vindas no formato "Bem-vindo, [nome]!" e imprime a
      mensagem. Aplique esse `Consumer` a uma lista de nomes.

19. **Cálculo de Dúzia de Itens**
    - Crie um `Consumer<Integer>` que calcula o número de dúzias em um número de itens e imprime o resultado. Aplique
      esse `Consumer` a uma lista de quantidades de itens.

20. **Geração de Código de Pedido**
    - Implemente um `Consumer<Integer>` que gera um código de pedido no formato "PEDIDO-[número]" e imprime o código.
      Aplique esse `Consumer` a uma lista de números de pedidos.

### Exemplos de Implementação

Aqui está um exemplo de como você pode implementar e testar alguns desses exercícios:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        // Exercício 1: Impressão de Inteiros
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40);
        Consumer<Integer> imprimeInteiro = numero -> System.out.println("Número: " + numero);
        numeros.forEach(imprimeInteiro);

        // Exercício 3: Atualização de Salários
        List<Double> salarios = Arrays.asList(2000.0, 2500.0, 3000.0);
        Consumer<Double> aumentaSalario = salario -> System.out.println("Salário atualizado: " + (salario * 1.05));
        salarios.forEach(aumentaSalario);

        // Exercício 5: Prefixo de Strings
        List<String> palavras = Arrays.asList("java", "python", "javascript");
        Consumer<String> adicionaPrefixo = palavra -> System.out.println("Prefixo_" + palavra);
        palavras.forEach(adicionaPrefixo);

        // Exercício 12: Verificação de Idade
        List<Integer> idades = Arrays.asList(16, 18, 21, 14);
        Consumer<Integer> verificaIdade = idade -> {
            if (idade >= 18) {
                System.out.println("Maior de idade: " + idade);
            } else {
                System.out.println("Menor de idade: " + idade);
            }
        };
        idades.forEach(verificaIdade);
    }
}
```

Esses exercícios ajudarão a reforçar o entendimento da interface `Consumer<T>` e sua aplicação em diversas situações de
consumo de dados e operações com efeitos colaterais.