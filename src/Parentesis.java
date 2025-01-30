import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(esBalanceado("([]){}"));
    }

    public static boolean esBalanceado (String cadena){
        boolean balanced;
        char caracter;
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length() ; i++) {
             caracter = cadena.charAt(i);
            if (caracter == '(' || caracter == '[' || caracter == '{'){
                pila.push(caracter);
            } else if (caracter == ')') {
                Character ultimo = pila.pop();

                return false;

            }

        }


        return true;
    }


}
