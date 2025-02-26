import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(esBalanceado("{})("));
    }
    public static boolean esBalanceado(String cadena){
        boolean balanced;
        char caracter;
        char ultimo;

        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (caracter == '(' || caracter == '{' || caracter == '['){
                pila.push(caracter);
            } else if (caracter == ')') {

                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                if (ultimo != '('){
                    return false;
                }
            } else if (caracter == '}') {
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                if (ultimo != '{'){
                    return false;
                }
            }else if (caracter == ']') {
                if (pila.isEmpty()){
                    return false;
                }
                ultimo = pila.pop();
                if (ultimo != '['){
                    return false;
                }
            }
        }

        return pila.isEmpty();

    }
}
