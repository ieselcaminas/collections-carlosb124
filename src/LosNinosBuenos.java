import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LosNinosBuenos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder resultado = new StringBuilder();

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            List<Niños> ninos = new ArrayList<>();

            for (int i = 0; i <= n ; i++) {
                int comportamiento = sc.nextInt();
                int peso = sc.nextInt();
                ninos.add(new Niños(i, comportamiento, peso));

            }

            Collections.sort(ninos);
            for (Niños niños : ninos){
                resultado.append(niños.id).append("\n");

            }
            resultado.append("\n");
        }

        System.out.println(resultado.toString().trim());;
    }
    
    
}
