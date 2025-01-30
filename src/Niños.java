import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Niños implements Comparable<Niños> {

    int id;
    int comportamiento;
    int peso;


    public Niños(int id, int comportamiento, int peso) {
        this.id = id;
        this.comportamiento = comportamiento;
        this.peso = peso;

    }


    @Override
    public int compareTo(Niños otro) {

        if (this.comportamiento != otro.comportamiento) {
            return Integer.compare(otro.comportamiento, this.comportamiento);

        }
        if (this.peso != otro.peso) {
            return Integer.compare(this.peso, otro.peso);

        }
        return Integer.compare(this.id, otro.id);

    }

    @Override
    public String toString() {
       return this.id + " " + this.comportamiento + " " + this.peso;
    }
}

