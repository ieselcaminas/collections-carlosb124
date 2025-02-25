package RefuerzoII;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero=3433;
        String num= numero+"";
        for (int i=0; i<num.length(); i++){
            if (i!=num.length()-1){
                System.out.print(num.charAt(i)+ " + ");
            } else {
                System.out.print(num.charAt(i)+ " = ");
            }
        }
        System.out.print(suma(num));
    }
    public static int suma(String num){
        int suma=0;
        int sumando;
        for (int i=0; i<num.length(); i++){
            sumando= Integer.parseInt(num.charAt(i)+"");
            suma+=sumando;
        }
        return suma;
    }


}
