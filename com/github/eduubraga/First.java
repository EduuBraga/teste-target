package com.github.eduubraga;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        /*
            1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
            valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que
            desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
            se o número informado pertence ou não a sequência.

            IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser
            previamente definido no código;
        */

        int numberProvider = 7;

        ArrayList<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);


        while(true) {
            int lastValueSequence = fibonacciSequence.get(fibonacciSequence.size() - 1);

            int penultimateValueSequence = fibonacciSequence.get(fibonacciSequence.size() - 2);

            int newValueSequence = lastValueSequence + penultimateValueSequence;

            fibonacciSequence.add(newValueSequence);

            /* Conferindo se o último valor é maior que o número provido para não sair no começo do loop*/
            if (lastValueSequence > numberProvider) {
                if (fibonacciSequence.contains(numberProvider)) {
                    System.out.printf("A sequência de Fibonacci contém o número: %d%n", numberProvider);
                    break;
                }

                System.out.printf("A sequência de Fibonacci não contém o número: %d%n", numberProvider);
                break;
            }
        };
    }
}
