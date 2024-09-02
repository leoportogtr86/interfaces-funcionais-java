package com.porto;

import com.porto.interfaces.Operacao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Operacao soma = Double::sum;
        Operacao divisao = (a, b) -> a / b;

        System.out.println(soma.exec(10, 45));
        System.out.println(divisao.exec(10, 45));
    }
}