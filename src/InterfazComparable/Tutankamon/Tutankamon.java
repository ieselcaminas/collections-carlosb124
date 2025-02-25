package InterfazComparable.Tutankamon;

import java.util.ArrayList;

public class Tutankamon {
    public static void main(String[] args) {
        ArrayList<Tesoro> tesoros = new ArrayList<>();
        Tesoro a = new Tesoro("Flechas", 5, 1,1);
        tesoros.add(a);
        a = new Tesoro("Sandalias", 10, 2,2);
        tesoros.add(a);
        a = new Tesoro("Sarcofago", 1000, 1000,3);
        tesoros.add(a);
        a= new Tesoro("Mascara", 1000, 10,4);
        tesoros.add(a);
        a = new Tesoro("Arco", 10, 2,5);
        tesoros.add(a);

        tesoros.stream().sorted().forEach(System.out::println);



    }
}
