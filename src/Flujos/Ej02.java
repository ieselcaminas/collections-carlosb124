package Flujos;

import java.util.ArrayList;
import java.util.List;

import static java.util.Locale.filter;

public class Ej02 {
    public static void main(String[] args) {
        ArrayList<Person> a = new ArrayList();
        Person b = new Person("Pepito", "Los Palites", 1984);
        a.add(b);
        b = new Person("Carlos", "Argucio", 1999);
        a.add(b);
        b = new Person("Fulgencio", "Ariete", 2002);
        a.add(b);

        long contarA = a.stream()
                .filter(c -> c.getLastName().startsWith("A"))
                .count();
        System.out.println(contarA);
    }
}
