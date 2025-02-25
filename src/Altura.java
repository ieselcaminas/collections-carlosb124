import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Altura {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de alumnos");
        ArrayList<Double> alturas = new ArrayList<>();
        double media;
        int alumnosSuperior;
        int alumnosInferior;
        int numAl = numeroAlumnos();
        System.out.println("Introduce las alturas");
        leerAlturas(alturas, numAl);
        media = calcularMedia(alturas);
        alumnosSuperior = calcularAlturaAlumnosSuperior(alturas, media);
        System.out.println(alumnosSuperior);
        alumnosInferior = calcularAlturaAlumnosInferior(alturas, media);
        System.out.println(alumnosInferior);
    }
    public static int numeroAlumnos(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void leerAlturas(ArrayList<Double> alturas, int numAl){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numAl; i++){
            alturas.add(sc.nextDouble());
        }
    }
    public static double calcularMedia(ArrayList<Double> alturas){
        double suma = 0;
        for (int i = 0; i < alturas.size(); i++){
            suma += alturas.get(i);
        }
        return suma/alturas.size();
    }
    public static int calcularAlturaAlumnosSuperior(ArrayList<Double> alturas, double media){
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++){
            if (alturas.get(i) > media){
                contador++;
            }
        }
        return contador;
    }
    public static int calcularAlturaAlumnosInferior(ArrayList<Double> alturas, double media){
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++){
            if (alturas.get(i) < media){
                contador++;
            }
        }
        return contador;
    }
}
