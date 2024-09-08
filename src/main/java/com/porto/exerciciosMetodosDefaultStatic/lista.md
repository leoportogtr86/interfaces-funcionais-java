Aqui estão 10 exercícios para praticar o uso de métodos `default` e `static` em interfaces funcionais em Java:

### Exercícios com Métodos `default`

1. **Método de Saudações**
    - Crie uma interface `Greeting` com um método `default` chamado `greetWithTitle` que receba um nome e um título e
      retorne uma saudação formatada (por exemplo, "Hello, Dr. Smith!"). Implemente uma classe `Person` que use esse
      método.

2. **Calcular Desconto**
    - Defina uma interface `DiscountCalculator` com um método `default` chamado `applyDiscount` que receba o preço
      original e a porcentagem de desconto e retorne o preço com desconto aplicado. Crie uma classe `Shop` que utilize
      essa interface para calcular e exibir o preço final com desconto.

3. **Exibir Informações**
    - Crie uma interface `Info` com um método `default` chamado `displayInfo` que exiba informações sobre um objeto.
      Implemente uma classe `Product` que use esse método para mostrar detalhes de um produto.

4. **Formatar Texto**
    - Defina uma interface `TextFormatter` com um método `default` chamado `formatText` que receba um texto e formate-o
      em maiúsculas. Implemente uma classe `Document` que utilize esse método para formatar e exibir o texto.

5. **Calculadora de Área**
    - Crie uma interface `Shape` com um método `default` chamado `calculateArea` que retorne uma área padrão (0.0).
      Implemente duas classes `Circle` e `Rectangle` que sobrescrevam esse método para calcular a área específica para
      cada forma.

6. **Contar Caracteres**
    - Defina uma interface `CharacterCounter` com um método `default` chamado `countCharacters` que conte o número de
      caracteres em uma string. Crie uma classe `TextAnalyzer` que utilize esse método para contar e exibir o número de
      caracteres.

7. **Verificar Paridade**
    - Crie uma interface `ParityChecker` com um método `default` chamado `isEven` que determine se um número é par.
      Implemente uma classe `NumberAnalyzer` que use esse método para verificar a paridade de uma lista de números.

8. **Gerar Senhas**
    - Defina uma interface `PasswordGenerator` com um método `default` chamado `generatePassword` que gere uma senha
      padrão. Implemente uma classe `UserAccount` que utilize esse método para criar e exibir senhas para contas de
      usuários.

9. **Converter para Maiúsculas**
    - Crie uma interface `UpperCaseConverter` com um método `default` chamado `convertToUpperCase` que converta uma
      string para maiúsculas. Implemente uma classe `TextEditor` que utilize esse método para formatar e exibir textos.

10. **Mostrar Hora Atual**
    - Defina uma interface `TimeProvider` com um método `default` chamado `showCurrentTime` que exiba a hora atual.
      Implemente uma classe `Clock` que use esse método para mostrar a hora em diferentes formatos.

### Exercícios com Métodos `static`

1. **Calcular Fatorial**
    - Crie uma interface `MathUtils` com um método `static` chamado `factorial` que calcule o fatorial de um número.
      Implemente uma classe `Calculator` que utilize esse método para calcular e exibir o fatorial de diferentes
      números.

2. **Validar Email**
    - Defina uma interface `EmailValidator` com um método `static` chamado `isValidEmail` que valide um endereço de
      e-mail usando uma expressão regular. Crie uma classe `ValidationService` que utilize esse método para validar e
      exibir a validade de diferentes e-mails.

3. **Gerar Números Aleatórios**
    - Crie uma interface `RandomNumberGenerator` com um método `static` chamado `generateRandom` que gere um número
      aleatório entre dois valores. Implemente uma classe `RandomGenerator` que use esse método para gerar e exibir
      números aleatórios.

4. **Calcular Potência**
    - Defina uma interface `PowerCalculator` com um método `static` chamado `power` que calcule a potência de um número
      elevado a um expoente. Implemente uma classe `MathOperations` que utilize esse método para calcular e exibir
      potências.

5. **Converter Temperatura**
    - Crie uma interface `TemperatureConverter` com um método `static` chamado `convertToFahrenheit` que converta uma
      temperatura de Celsius para Fahrenheit. Implemente uma classe `TemperatureService` que use esse método para
      converter e exibir temperaturas.

6. **Formatar Data**
    - Defina uma interface `DateFormatter` com um método `static` chamado `formatDate` que formate uma data em um
      formato específico (por exemplo, "dd/MM/yyyy"). Implemente uma classe `DateUtils` que utilize esse método para
      formatar e exibir datas.

7. **Calcular Média**
    - Crie uma interface `Statistics` com um método `static` chamado `calculateAverage` que calcule a média de um array
      de números. Implemente uma classe `StatsCalculator` que use esse método para calcular e exibir a média de
      diferentes conjuntos de dados.

8. **Criar UUID**
    - Defina uma interface `UUIDGenerator` com um método `static` chamado `generateUUID` que gere um UUID único. Crie
      uma classe `UniqueIDService` que utilize esse método para gerar e exibir UUIDs.

9. **Converter String para Inteiro**
    - Crie uma interface `StringConverter` com um método `static` chamado `parseInt` que converta uma string para um
      inteiro. Implemente uma classe `StringToIntConverter` que use esse método para converter e exibir números
      inteiros.

10. **Calcular Média Harmônica**
    - Defina uma interface `HarmonicMeanCalculator` com um método `static` chamado `harmonicMean` que calcule a média
      harmônica de um array de números. Crie uma classe `MeanCalculator` que utilize esse método para calcular e exibir
      a média harmônica.

### Exemplos de Implementação

Aqui estão alguns exemplos de como você pode implementar e testar alguns dos exercícios:

```java
import java.util.List;
import java.util.regex.Pattern;

public class DefaultStaticMethodsExample {

    // Exercício 1: Saudações
    public interface Greeting {
        default String greetWithTitle(String name, String title) {
            return "Hello, " + title + " " + name + "!";
        }
    }

    public static class Person implements Greeting {
        public static void main(String[] args) {
            Person person = new Person();
            System.out.println(person.greetWithTitle("Smith", "Dr."));
        }
    }

    // Exercício 2: Calcular Desconto
    public interface DiscountCalculator {
        default double applyDiscount(double price, double discount) {
            return price * (1 - discount / 100);
        }
    }

    public static class Shop implements DiscountCalculator {
        public static void main(String[] args) {
            Shop shop = new Shop();
            double discountedPrice = shop.applyDiscount(100.0, 10.0);
            System.out.println("Discounted price: $" + discountedPrice);
        }
    }

    // Exercício 3: Exibir Informações
    public interface Info {
        default void displayInfo(String info) {
            System.out.println("Info: " + info);
        }
    }

    public static class Product implements Info {
        public static void main(String[] args) {
            Product product = new Product();
            product.displayInfo("Product details");
        }
    }

    // Exercício 4: Calcular Fatorial
    public interface MathUtils {
        static long factorial(int number) {
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static class Calculator {
        public static void main(String[] args) {
            long result = MathUtils.factorial(5);
            System.out.println("Factorial of 5 is: " + result);
        }
    }

    // Exercício 5: Validar Email
    public interface EmailValidator {
        static boolean isValidEmail(String email) {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            return Pattern.compile(emailRegex).matcher(email).matches();
        }
    }

    public static class ValidationService {
        public static void main(String[] args) {
            boolean isValid = EmailValidator.isValidEmail("example@example.com");
            System.out.println("Is valid email: " + isValid);
        }
    }
}
```

Esses exercícios vão ajudar a solidificar o entendimento dos métodos `default` e `static` em interfaces, demonstrando
suas aplicações práticas e benefícios.