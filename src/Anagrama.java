import java.io.*;
import java.util.*;


public class Anagrama {
    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<String>> mapaAnagramas = generarMapa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();
        String palabraOrdenada = alphabetize(palabra);
        ArrayList<String> listaDesordenada = mapaAnagramas.get(palabraOrdenada);
        if (listaDesordenada == null) {
            System.out.println("No hay anagramas");
        } else {
            System.out.println("Anagramas: ");
            for (String anagrama : listaDesordenada) {
                System.out.println(anagrama);
            }
        }
    }
    public static Map<String, ArrayList<String>> generarMapa() throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String palabraDesordenada;
        String palabraOrdenada;
        ArrayList<String> listaDesordenada;


        Map<String, ArrayList<String>> mapaAnagramas = new HashMap<>();
        while ((palabraDesordenada = reader.readLine()) != null) {
            palabraOrdenada = alphabetize(palabraDesordenada);
            listaDesordenada = mapaAnagramas.get(palabraOrdenada);


            if (listaDesordenada == null) {
                listaDesordenada = new ArrayList<>();
                listaDesordenada.add(palabraDesordenada);
                mapaAnagramas.put(palabraOrdenada, listaDesordenada);


            } else {
                listaDesordenada.add(palabraDesordenada);
                mapaAnagramas.put(palabraOrdenada, listaDesordenada);
            }
        }
        return mapaAnagramas;
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
