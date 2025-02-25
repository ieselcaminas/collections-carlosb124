package Flujos;

import java.util.Arrays;

public class Ej04 {
    public static void main(String[] args) {
        int[] numeros= {5, 7, 4, 3, 8, 2};
//        long contarNumeros = Arrays.stream(numeros)
//                .filter(num -> num >= 1 && num <= 5)
//                .count();
//        System.out.println(contarNumeros);

        Arrays.stream(numeros)
                .filter(num -> num >= 1 && num <= 5)
                .forEach(imprimir -> System.out.println(imprimir));
    }
}
