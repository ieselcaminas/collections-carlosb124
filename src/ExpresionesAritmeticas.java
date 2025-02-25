import java.util.Stack;

import static java.lang.Character.isDigit;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        String operacionCompleta = "5 1 2 + 4 * + 3 -";
        System.out.println(calculo(operacionCompleta));
    }
    public static boolean esNumero(String numSuelto) {
        if (isDigit(numSuelto.charAt(0))) {
            return true;
        }
        return false;
    }
    public static int calculo(String operacionCompleta) {
        String operacion[] = operacionCompleta.split(" ");
        Integer numero;
        Integer n1;
        Integer n2;
        Integer resultado = 0 ;
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < operacion.length; i++) {
            if (esNumero(operacion[i])) {
                numero = Integer.parseInt("" + operacion[i]);
                pila.push(numero);
            } else {
                n2 = pila.pop();
                n1 = pila.pop();
                if (operacion[i].equals("+")) {
                    pila.push(n1 + n2);
                } else if (operacion[i].equals("-")) {
                    pila.push(n1 - n2);
                } else if (operacion[i].equals("*")) {
                    pila.push(n1 * n2);
                } else if (operacion[i].equals("/")) {
                    pila.push(n1 / n2);
                }
            }
        }
        for (int i = 0; i < pila.size(); i++) {
            resultado += pila.pop();
        }
        return resultado;
    }
}
