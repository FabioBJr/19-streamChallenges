package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    //Agrupe os números em pares e ímpares:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();

        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();

        System.out.println("Números pares presentes na lista: " + numerosPares);
        System.out.println("Números ímpares presentes na lista: " + numerosImpares);
    }
}
