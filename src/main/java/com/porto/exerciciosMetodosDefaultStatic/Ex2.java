package com.porto.exerciciosMetodosDefaultStatic;

import com.porto.models.Shop;

public class Ex2 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        System.out.println(shop.applyDiscount(100, 0.1));
    }
}

//2. **Calcular Desconto**
//- Defina uma interface `DiscountCalculator` com um método `default` chamado `applyDiscount`
//que receba o preço original e a porcentagem de desconto e retorne o preço com desconto aplicado.
//Crie uma classe `Shop` que utilize essa interface para calcular e exibir o preço final com
//desconto.
