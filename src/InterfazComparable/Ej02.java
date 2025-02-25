package InterfazComparable;

import java.util.ArrayList;
import java.util.List;

public class Ej02 {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();

        Human h = new Human("Armando", 1200);
        humanList.add(h);
        h = new Human("Pedro", 1100);
        humanList.add(h);
        h = new Human("Carlos", 1500);
        humanList.add(h);

        humanList.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
