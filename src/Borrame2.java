import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Borrame2 {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(1);
        notas.add(2);
        notas.add(3);
        notas.add(4);

        double suma = 0;
        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i);
        }
        double media = suma / notas.size();
        System.out.println("Media: " + media);
        suma = 0;
        notas.remove(0);
        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i);
        }
        media = suma / notas.size();
        System.out.println("Media: " + media);
        Collections.sort(notas);
    }
}
