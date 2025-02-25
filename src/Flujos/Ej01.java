package Flujos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej01 {
    public static void main(String[] args) {
        int[] numeros = new int[]{2, 5, 1, 4};

        Arrays.sort(numeros);

        List<Person> personas = new ArrayList<>();

        Person p = new Person("Pepe", "Viyuela", 1989);
        personas.add(p);
        p = new Person("Fernando", "Diaz", 1798);
        personas.add(p);


        long cuantasPersonas = personas.stream()
                .filter(unaPersona -> unaPersona.getBirthYear() < 1970)
                .count();
        System.out.println(cuantasPersonas);
        }
}
