package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    //Filtrar os números que estão dentro de um intervalo(por exemplo: 5 e 10)
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int intervaloMinimo = 5;
        int intervaloMaximo = 5;


        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(n -> n > intervaloMinimo && n < intervaloMaximo)
                .toList();

        System.out.println("Números no intervalor [" + intervaloMinimo +", " + intervaloMaximo + "]: " + numerosNoIntervalo);
    }
}
