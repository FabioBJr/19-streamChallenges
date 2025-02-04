package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    //Verificar se todos os números da lista são distintos(não se repetem):
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
        boolean todosDistintos = numeros.stream()
                                    .collect(Collectors.toSet())
                                    .size() == numeros.size();
        System.out.println("Todos os números são distintos: " + todosDistintos);
        */

        boolean todosDistintos = numeros.stream()
                .distinct()
                .count() == numeros.size();

        System.out.println("Todos os números são distintos: " + todosDistintos);
    }
}
