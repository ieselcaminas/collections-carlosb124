package InterfazComparable.Ninyo;

import java.util.ArrayList;
import java.util.List;

public class Bondad {
    public static void main(String[] args) {
        List<Ninyo> ninyos = new ArrayList<>();
        Ninyo a = new Ninyo(7, 12);
        ninyos.add(a);

        a = new Ninyo(10, 7);
        ninyos.add(a);

        a = new Ninyo(10, 1);
        ninyos.add(a);

        ninyos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
