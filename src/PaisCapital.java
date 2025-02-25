import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        mapa1.put("españa", "Madrid");
        mapa1.put("portugal", "Lisboa");
        mapa1.put("francia", "Paris");
        mapa1.put("alemania", "Berlin");
        System.out.println("Escribe un pais europeo");
        Scanner sc = new Scanner(System.in);
        String pais = sc.nextLine();
        pais = pais.toLowerCase();
        System.out.println(mapa1.getOrDefault(pais, "No existe ese pais"));

    }
}
