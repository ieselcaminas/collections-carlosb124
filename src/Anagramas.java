import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<String>> mapa = genMapa();
        System.out.println(mapa);
    }
    public static Map<String, ArrayList<String>> genMapa()throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String palabraDesordenada;
        String palabraOrdenada;
        Map<String, ArrayList<String>> mapaAnagramas = new HashMap<>();
        ArrayList<String> listaDesordenadas;

        while ((palabraDesordenada = reader.readLine())!=null) {
            //Trabajar con palabraDesordenada
            palabraOrdenada = ordenarPalabra(palabraDesordenada);
            listaDesordenadas = mapaAnagramas.get(palabraOrdenada);
            if (listaDesordenadas==null) {
                listaDesordenadas = new ArrayList<>();
            }
            listaDesordenadas.add(palabraDesordenada);
            mapaAnagramas.put(palabraOrdenada, listaDesordenadas);
        }
        reader.close();
        return mapaAnagramas;
    }



    private static String ordenarPalabra(String line) {
        char[] a = line.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}

