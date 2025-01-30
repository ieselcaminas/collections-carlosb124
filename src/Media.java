import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Media {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        double suma = 0;

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);


        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);

        }
        System.out.println(suma);

        Collections.sort(numeros);


    }
}
