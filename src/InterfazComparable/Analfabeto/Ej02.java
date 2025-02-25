package InterfazComparable.Analfabeto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ej02 {
    public static void main(String[] args) throws IOException{
        BufferedReader lector = new BufferedReader(new FileReader("files/illiterate.csv"));
        String linea;
        lector.readLine();
        ArrayList<Analfabeto>a = new ArrayList();
         while((linea = lector.readLine()) != null){
             String[] datos = linea.split(",");
             Analfabeto ordenadoA = new Analfabeto(datos[5], Integer.parseInt(datos[8]));
             a.add(ordenadoA);
         }
        a.stream().sorted().forEach(System.out::println);
    }
}
