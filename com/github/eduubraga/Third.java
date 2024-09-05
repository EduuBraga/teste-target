package com.github.eduubraga;

public class Third {
    public static void main(String[] args) {
        /*
            Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1;
            SOMA = SOMA + K; } imprimir(SOMA);

            Ao final do processamento, qual será o valor da variável SOMA?
        */

        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        if (K < INDICE) {
            K++;
            SOMA = SOMA + K;
        }

        System.out.println(SOMA);
    }
}
