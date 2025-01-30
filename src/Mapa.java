import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Mapa {

    public static void main(String[] args) {
            Map<String, String> mapa1 = new HashMap<String, String>();
            mapa1.put("Francia", "Paris");
            mapa1.put("España", "Madrid");
            mapa1.put("Alemania", "Berlín");
            mapa1.put("Rumanía", "Bucarest");


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un país ");
        String país = sc.nextLine();

        if (mapa1.containsKey(país)){
            System.out.println(mapa1.get(país));
        }



    }
    }


