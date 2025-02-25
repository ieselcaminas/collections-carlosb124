import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LastNameFrequency {
    public static void main(String[] args) throws IOException {
        String apellido;
        do {
            System.out.println("Introduce un apellido, para acabar introduce un espacio");
            Scanner sc = new Scanner(System.in);
            apellido = sc.nextLine();
            System.out.println(countCountries(apellido.toUpperCase()));
        } while(!apellido.isEmpty());
    }

    public static String countCountries(String apellido)throws IOException {
        Map<String, String> elMapaElMapa = new HashMap<>();
        BufferedReader lector = new BufferedReader(new FileReader("files/LastnameFrequencies.csv"));
        String linea;
        String[] campos;
        while ((linea = lector.readLine()) != null) {
            campos = linea.split(",");
            if (campos.length != 2) {
                continue;
            }
            elMapaElMapa.put(campos[0], campos[1]);
            if (elMapaElMapa.containsKey(apellido)) {
                return campos[1];
            }
        }
        return "NO";
    }
}
