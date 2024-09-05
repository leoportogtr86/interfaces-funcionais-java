Aqui estão 20 exercícios para praticar o uso da interface `Supplier<T>` em Java:

### Exercícios sobre a Interface `Supplier<T>`

1. **Criação de Pessoa**
    - Crie um `Supplier<Pessoa>` que forneça uma nova instância de `Pessoa` com nome e idade aleatórios. Aplique
      o `Supplier` para criar e imprimir uma pessoa.

2. **Geração de Senha**
    - Implemente um `Supplier<String>` que gere uma senha aleatória com 10 caracteres. Use caracteres alfanuméricos e
      imprima a senha gerada.

3. **Fabricante de Produtos**
    - Crie um `Supplier<Produto>` que forneça uma instância de `Produto` com um nome e um preço fixos. Aplique
      o `Supplier` para criar e imprimir um produto.

4. **Gerador de Data**
    - Implemente um `Supplier<LocalDate>` que forneça a data atual. Use o `Supplier` para obter e imprimir a data atual.

5. **Geração de Identificadores**
    - Crie um `Supplier<String>` que gere um identificador único (UUID) e imprima o resultado.

6. **Configuração de Banco de Dados**
    - Implemente um `Supplier<ConexaoBanco>` que forneça uma conexão com um URL específico. Use o `Supplier` para criar
      e imprimir a conexão.

7. **Gerador de Números Aleatórios**
    - Crie um `Supplier<Integer>` que gere números inteiros aleatórios entre 1 e 100. Gere e imprima 5 números
      aleatórios.

8. **Criação de Endereços**
    - Implemente um `Supplier<Endereco>` que forneça uma instância de `Endereco` com rua e cidade fixos. Aplique
      o `Supplier` para criar e imprimir um endereço.

9. **Fabricante de Usuários**
    - Crie um `Supplier<Usuario>` que forneça uma instância de `Usuario` com nome e email fixos. Use o `Supplier` para
      criar e imprimir um usuário.

10. **Geração de Códigos de Promoção**
    - Implemente um `Supplier<String>` que gere um código de promoção aleatório com 8 caracteres. Imprima o código
      gerado.

11. **Geração de Arquivo de Log**
    - Crie um `Supplier<ArquivoLog>` que forneça uma instância de `ArquivoLog` com um caminho de arquivo fixo. Use
      o `Supplier` para criar e imprimir o arquivo de log.

12. **Gerador de Idade**
    - Implemente um `Supplier<Integer>` que forneça uma idade aleatória entre 18 e 65 anos. Gere e imprima 3 idades
      aleatórias.

13. **Configuração de Serviço**
    - Crie um `Supplier<Servico>` que forneça uma instância de `Servico` com configurações padrão. Aplique o `Supplier`
      para criar e imprimir o serviço.

14. **Geração de Mensagens de Boas-vindas**
    - Implemente um `Supplier<String>` que forneça uma mensagem de boas-vindas com um nome fixo. Imprima a mensagem
      gerada.

15. **Criação de Tokens de Sessão**
    - Crie um `Supplier<String>` que gere um token de sessão aleatório com 16 caracteres. Imprima o token gerado.

16. **Geração de Objetos de Configuração**
    - Implemente um `Supplier<Configuracao>` que forneça uma instância de `Configuracao` com valores padrão. Use
      o `Supplier` para criar e imprimir a configuração.

17. **Criação de Mensagens de Erro**
    - Crie um `Supplier<String>` que forneça uma mensagem de erro genérica. Imprima a mensagem gerada.

18. **Geração de Produtos Aleatórios**
    - Implemente um `Supplier<Produto>` que forneça um produto com nome e preço aleatórios. Gere e imprima 3 produtos
      aleatórios.

19. **Configuração de Sessão de Usuário**
    - Crie um `Supplier<SessaoUsuario>` que forneça uma instância de `SessaoUsuario` com um ID de sessão fixo. Aplique
      o `Supplier` para criar e imprimir a sessão.

20. **Geração de Cartões de Crédito**
    - Implemente um `Supplier<String>` que forneça um número de cartão de crédito fictício com 16 dígitos. Imprima o
      número gerado.

### Exemplos de Implementação

Aqui está um exemplo de como você pode implementar e testar alguns desses exercícios:

```java
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import java.time.LocalDate;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + '}';
    }
}

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{nome='" + nome + "', preco=" + preco + '}';
    }
}

class ConexaoBanco {
    String url;

    ConexaoBanco(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ConexaoBanco{url='" + url + "'}";
    }
}

public class ExemploSupplier {
    public static void main(String[] args) {
        // Exercício 1: Criação de Pessoa
        Supplier<Pessoa> fornecedorPessoa = () -> new Pessoa("Ana", 25);
        Pessoa pessoa = fornecedorPessoa.get();
        System.out.println(pessoa);

        // Exercício 7: Gerador de Números Aleatórios
        Random random = new Random();
        Supplier<Integer> fornecedorNumeroAleatorio = () -> random.nextInt(100) + 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(fornecedorNumeroAleatorio.get());
        }

        // Exercício 11: Geração de Arquivo de Log
        Supplier<String> fornecedorArquivoLog = () -> "logfile.log";
        System.out.println("Caminho do arquivo de log: " + fornecedorArquivoLog.get());

        // Exercício 15: Criação de Tokens de Sessão
        Supplier<String> fornecedorToken = () -> UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        System.out.println("Token de sessão: " + fornecedorToken.get());

        // Exercício 19: Configuração de Sessão de Usuário
        Supplier<SessaoUsuario> fornecedorSessao = () -> new SessaoUsuario("sessao123");
        SessaoUsuario sessao = fornecedorSessao.get();
        System.out.println(sessao);
    }
}
```

Esses exercícios ajudarão a praticar a aplicação da interface `Supplier<T>` em diferentes contextos, promovendo a
geração flexível de valores e recursos.