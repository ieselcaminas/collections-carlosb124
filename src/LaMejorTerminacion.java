import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LaMejorTerminacion {
    public static void main(String[] args) {
        String[] numeros = {"71717", "90809", "66474"};
        System.out.println(terminaciones(numeros));

    }
    public static Map<Character, Integer> terminaciones(String[] boletos){
        Map<Character, Integer> terminaciones = new HashMap<>();
        Character ultimo;
        Integer contador;

        for (int i = 0; i < boletos.length; i++) {
            ultimo  = boletos[i].charAt(boletos[i].length() -1 );
            contador = terminaciones.get(ultimo);
            if (contador == null) {
                terminaciones.put(ultimo, 1);
            }else{
                terminaciones.put(ultimo, contador + 1);
            }
        }
        return terminaciones;
    }
}
