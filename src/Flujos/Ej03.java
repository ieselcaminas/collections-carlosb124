package Flujos;

import java.util.ArrayList;

public class Ej03 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList();
        Person p = new Person("Pepito", "Los Palites", 1984);
        personas.add(p);
        p = new Person("Pepito", "Argucio", 1999);
        personas.add(p);
        p = new Person("Fulgencio", "Ariete", 2002);
        personas.add(p);

        personas.stream()
                .map(persona -> persona.getFirstName())
                .distinct()
                .sorted()
                .forEach(apellido -> System.out.println(apellido));
    }
}
