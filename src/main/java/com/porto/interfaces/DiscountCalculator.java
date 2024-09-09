package com.porto.interfaces;

public interface DiscountCalculator {
    default double applyDiscount(double precoOriginal, double desconto) {
        return precoOriginal - (precoOriginal * desconto);
    }
}

//2. **Calcular Desconto**
//- Defina uma interface `DiscountCalculator` com um método `default` chamado `applyDiscount`
//que receba o preço original e a porcentagem de desconto e retorne o preço com desconto aplicado.
//Crie uma classe `Shop` que utilize essa interface para calcular e exibir o preço final com
//desconto.
