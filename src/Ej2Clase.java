import java.util.List;

public class Ej2Clase {
    public static void main(String[] args) {

        List<Person> persons = List.of(new Person("Juan", "Arias", 1990), new Person("Ana", "Martínez", 1985), new Person("Carlos" ,"Alonso", 1978));

        long count = persons.stream().filter(person -> person.getLastName().startsWith("A")).count();
        System.out.println("Personas con apellido que empieza con 'A':  " + count);

    }




}
