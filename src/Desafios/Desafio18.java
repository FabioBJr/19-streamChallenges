package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    //Verifique se todos os números da lista são iguais:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.getFirst()));

        if(todosIguais) {
            System.out.println("Todos os números da lista são iguais");
        } else {
            System.out.println("Nem todos os números da lista são iguais");
        }
    }
}
