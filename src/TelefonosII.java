import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelefonosII {
    public static void main(String[] args) {
        ArrayList<String> telefonosPepe = new ArrayList();
        telefonosPepe.add("11");
        telefonosPepe.add("22");

        ArrayList<String> telefonosJuan = new ArrayList();
        telefonosJuan.add("33");
        telefonosJuan.add("44");

        Map<String, ArrayList<String>> agenda = new HashMap();

        agenda.put("Pepe", telefonosPepe);
        agenda.put("Juan", telefonosJuan);
    }
}
