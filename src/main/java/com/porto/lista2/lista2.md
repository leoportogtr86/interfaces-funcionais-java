# Lista de 10 exercícios sobre a interface `Function<T, R>` para ajudar a entender e praticar suas aplicações:

### **Exercícios**

1. **Transformação Simples**
    - Crie uma função `Function<String, Integer>` que converta uma string que representa um número em um inteiro. Teste
      essa função com algumas strings representando números.

2. **Conversão de Temperatura**
    - Implemente uma função `Function<Double, Double>` que converta uma temperatura de Celsius para Fahrenheit. Teste a
      função com uma temperatura de 25°C.

3. **Função de Comprimento**
    - Crie uma função `Function<String, Integer>` que calcula o comprimento de uma string. Use essa função para calcular
      e imprimir o comprimento de diferentes palavras.

4. **Transformação de Lista**
    - Dada uma lista de inteiros, use a interface `Function` para criar uma nova lista onde cada elemento é o quadrado
      do elemento original. Imprima a lista resultante.

5. **Função Composta**
    - Crie duas funções `Function<Integer, Integer>`: uma que dobra o valor e outra que adiciona 10 ao valor. Componha
      essas funções para criar uma nova função que dobre o valor e depois adicione 10. Teste a nova função com o valor
      5.

6. **Remoção de Espaços**
    - Crie uma função `Function<String, String>` que remove espaços em branco no início e no final de uma string. Teste
      a função com a string `"   Olá Mundo!   "`.

7. **Inversão de Texto**
    - Implemente uma função `Function<String, String>` que inverte o texto de uma string. Teste a função com a
      string `"Java"`.

8. **Maiúsculas e Minúsculas**
    - Crie uma função `Function<String, String>` que converte uma string para minúsculas e, em seguida, aplique uma
      função `Function<String, String>` que converte uma string para maiúsculas. Componha essas funções para garantir
      que a string resultante esteja em maiúsculas. Teste com a string `"Exemplo"`.

9. **Mapeamento de Lista**
    - Dada uma lista de strings representando números em formato textual, use uma função `Function<String, Integer>`
      para converter cada string em um inteiro e colecione os resultados em uma nova lista. Imprima a lista resultante.

10. **Calculadora de Comprimento e Maiúsculas**
    - Crie uma função `Function<String, String>` que primeiro converte a string para maiúsculas e depois calcula o
      comprimento da string. Teste a função com a string `"Programação"` e imprima o resultado.

Esses exercícios cobrem uma variedade de usos da interface `Function<T, R>`, desde transformações simples até
composições e aplicações em listas. Eles ajudarão a reforçar a compreensão e aplicação da interface em diferentes
cenários.