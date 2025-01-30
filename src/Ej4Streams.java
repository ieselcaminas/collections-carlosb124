import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ej4Streams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();


        System.out.println("Introduce números, si introduces negativos, terminará el programa");
        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
                numeros.add(numero);
            }
         List<Integer> filtrados = numeros.stream()
                .filter(num -> num >= 1 && num <= 5)
                .collect(Collectors.toList());

        System.out.println("Números entre 1 y 5");
        filtrados.forEach(System.out::println);
    }
}
