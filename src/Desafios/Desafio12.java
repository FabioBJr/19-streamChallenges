package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    //Encontre o produto de todos os números
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produto = numeros.stream()
                //.reduce(1, (a, b) -> a * b);
                .reduce(1, Math::multiplyExact);
    }
}
