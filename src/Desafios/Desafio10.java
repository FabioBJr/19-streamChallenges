package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
    //Agrupe os valores ímpares múltiplos de 3 ou de 5:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> imparesMultiplos3e5 = numeros.stream()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();

        System.out.println("Lista com números ímpares divisíveis por 3 ou 5: " + imparesMultiplos3e5);
    }
}
