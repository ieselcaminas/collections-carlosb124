import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefono {

        public static void main(String[] args) {
            Map<String, String> mapa1 = new HashMap<String, String>();
            mapa1.put("Saber", "6848968949");
            mapa1.put("JD", "3425235246");
            mapa1.put("Albert", "34125234535");
            mapa1.put("Daniel", "134124124");


            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un contacto ");
            String contacto = sc.nextLine();

            if (mapa1.containsKey(contacto)){
                System.out.println(mapa1.get(contacto));
            }
        }
    }



