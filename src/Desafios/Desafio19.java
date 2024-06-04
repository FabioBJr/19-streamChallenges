package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio19 {
    //Encontre a soma dos números divisíveis por 3 e 5:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> soma = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(Integer::sum);

        soma.ifPresentOrElse(
                n -> System.out.println("A soma dos números divisíveis por 3 e 5 é: " + soma),
                () -> System.out.println("Nenhum número divisível por 3 e 5 na lista")
        );
    }
}
