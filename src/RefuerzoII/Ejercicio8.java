package RefuerzoII;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {4,6,5,2,3};
        Arrays.sort(numeros);
        if (faltaNum(numeros) == -1) {
            System.out.println("Todo Gucci");
        } else {
            System.out.println("Falta el numero: " + faltaNum(numeros));
        }
    }
    public static int faltaNum(int[]numeros) {
        for (int i = 0; i < numeros.length -1 ; i++) {
            if (numeros[i]+1 != numeros[i+1]) {
                return numeros[i]+1;
            }
        }
        return -1;
    }

}
