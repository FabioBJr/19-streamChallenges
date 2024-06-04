package Desafios;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    //Encontre o maior número primo da lista:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(n -> n > 1 && isPrime(n))
                .max(Integer::compareTo);

        maiorPrimo.ifPresent(primo -> System.out.println("O maior número primo é: " + maiorPrimo));
    }

    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        for (int i = 2; i<= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
