import java.util.Stack;

public class expresionesAritmeticas {


    public static int calculo (String expresion) {
        Stack<Integer> pila = new Stack<>();
        String [] terminos = expresion.split("");
        Integer numero;
        Integer n2;
        Integer n1;
        Integer r;
        for (int i = 0; i < terminos.length ; i++) {
            if (esOperador(terminos[i])){
                numero = Integer.parseInt("" + terminos[i]);
                pila.push(numero);

            }else{
                n2 = pila.pop();
                n1 = pila.pop();
                if (terminos[i].equals("+")){
                    r = n1 + n2;
                    pila.push(r);
                }

        }
        }





        return 0;
    }

    private static boolean esOperador (String cadena) {
        return Character.isDigit(cadena.charAt(0));
    }







    public static void main(String[] args) {

    }

}
