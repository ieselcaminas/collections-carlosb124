import java.util.HashMap;
import java.util.Map;

public class botin {
    public static Map<Integer, Integer> repartirBotin(int numParticipantes, int [] billetes){

        Map <Integer, Integer> resultado = new HashMap<>();

        for (int i = 0; i < numParticipantes; i++) {
            resultado.put(i,0);

        }
        for (int i = 0; i < billetes.length; i++) {
            int participante = i% numParticipantes;

            resultado.put(participante, resultado.get(participante) + billetes[i]);

        }

        return resultado;
    }

    public static void main(String[] args) {
        int numParticipantes = 3;
        int [] billetes = {50, 200, 50, 500, 1, 20, 500, 10};

        Map<Integer, Integer> resultado = repartirBotin(numParticipantes, billetes);

        for (Map.Entry<Integer , Integer> entry : resultado.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }



}
