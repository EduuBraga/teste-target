package com.github.eduubraga;

public class Second {
    public static void main(String[] args) {
        /*
           2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
           além de informar a quantidade de vezes em que ela ocorre.

           IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser
           previamente definida no código;
        */

        String name = "Carlos EduaArdo";
        int characterCounter = 0;

        for (int i = 0; i < name.length(); i++) {
            String characterName = String.valueOf(name.charAt(i));

            if(characterName.equals("a") || characterName.equals("A")) {
                characterCounter = characterCounter + 1;
            }
        }

        System.out.printf("Dentro da String \"%s\" contém %d \"a\"", name, characterCounter);
    }
}
