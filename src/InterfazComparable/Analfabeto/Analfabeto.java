package InterfazComparable.Analfabeto;

public class Analfabeto implements Comparable<Analfabeto>{
    private String pais;
    private int nAnalfabetos;

    public Analfabeto(String pais, int nAnalfabetos) {
        this.pais = pais;
        this.nAnalfabetos = nAnalfabetos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getnAnalfabetos() {
        return nAnalfabetos;
    }

    public void setnAnalfabetos(int nAnalfabetos) {
        this.nAnalfabetos = nAnalfabetos;
    }
    public String toString() {
        return this.pais + "-" + this.nAnalfabetos;
    }

    public int compareTo(Analfabeto other) {
        return this.nAnalfabetos - other.nAnalfabetos;
    }
}
