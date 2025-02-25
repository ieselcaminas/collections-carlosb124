import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, String> guiaTelefonos = new HashMap<String, String>();
        guiaTelefonos.put("emergencias", "112");
        guiaTelefonos.put("javier", "+34 964212121");
        guiaTelefonos.put("silva", "+34 640121212");
        System.out.println("Escribe un contacto");
        Scanner sc = new Scanner(System.in);
        String contacto = sc.nextLine();
        contacto = contacto.toLowerCase();
        System.out.println(guiaTelefonos.getOrDefault(contacto, "No existe ese contacto"));
    }
}
