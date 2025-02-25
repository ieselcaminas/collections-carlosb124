package RefuerzoII;

public class Ejercicio6 {
    public static void main(String[] args) {
        String numero = "4678";
        if(esHyperpar(numero)){
            System.out.println("Es Hyperpar");
        } else {
            System.out.println("No es Hyperpar");
        }
    }
    public static boolean esHyperpar(String numero) {
        char digito;
        int digito1;
        for (int i = 0; i < numero.length(); i++) {
            digito = numero.charAt(i);
            digito1 = Integer.parseInt(String.valueOf(digito));
            if (digito1 %2 == '0') {
                return true;
            } else if (digito1 %2 == '1') {
                return false;
            }
        }
        return true;
    }

}
