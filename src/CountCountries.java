import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        Map<String, Integer>mapa = countCountries();
        System.out.println(mapa);
    }
    public static Map<String, Integer> countCountries()throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader lector = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String linea;
        String[] campos;
        String pais;
        Integer cuantos;
        lector.readLine();
        while ((linea = lector.readLine()) != null) {
            campos = linea.split(",");
            pais = campos[6];
            cuantos = map.get(pais);
            if (cuantos == null) {
                map.put(pais, 1);
            } else {
                map.put(pais, cuantos + 1);
            }
        }
        lector.close();
        return map;
    }
}
