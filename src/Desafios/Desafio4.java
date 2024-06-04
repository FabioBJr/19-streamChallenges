package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    //Remova todos os valores ímpares
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.removeIf(n -> n % 2 != 0);

        System.out.println("Lista com os números ímpares removidos: " + numeros);
    }
}
