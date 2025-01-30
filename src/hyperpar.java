public class hyperpar {
    public static void main(String[] args) {
        System.out.println(esHyperpar(468));
        System.out.println(esHyperpar(3456));
    }

    public static boolean esHyperpar (int numero) {
        int digito;
        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 != 0){
                return false;
            }
            numero /= 10;
        }
        return true;
    }
}
