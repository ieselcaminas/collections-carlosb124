package RefuerzoII;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(moda(new int[]{3,4,3}));
    }
    public static int moda(int[] numeros){
        int moda = 0;
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numeros.length;i++){
            map.put(numeros[i],map.getOrDefault(numeros[i],0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }
}
