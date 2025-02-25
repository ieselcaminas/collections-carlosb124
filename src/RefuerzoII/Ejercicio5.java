package RefuerzoII;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8};
        System.out.println(mediana(numeros));
    }
    public static double mediana(int[] numeros){
        double mediana = 0;
        double n1, n2;
        Arrays.sort(numeros);
        if(numeros.length % 2 == 0){
            n1 = numeros[numeros.length/2];
            n2 = numeros[numeros.length/2-1];
            mediana = (n1 + n2)/2;
        }
        else{mediana = numeros[numeros.length/2];}
        return mediana;
    }
}
