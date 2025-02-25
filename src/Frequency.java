import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("uno");
        palabras.add("dos");
        palabras.add("uno");
        palabras.add("tres");
        palabras.add("dos");
        palabras.add("dos");
        System.out.println(frequency(palabras));
    }
    public static Map<String, Integer> frequency(ArrayList<String> palabras) {
      Map<String, Integer> frequency = new HashMap<>();
      Integer cont;
      for (String palabra : palabras) {
          cont = frequency.get(palabra);
          if (cont == null) {
              frequency.put(palabra, 1);
          } else {
              frequency.put(palabra, cont+1);
          }
      }
      return frequency;
    }
}
