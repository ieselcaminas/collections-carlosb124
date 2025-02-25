package InterfazComparable.Tutankamon;

public class Tesoro implements Comparable<Tesoro>{
    private String nombre;
    private int vHistorico;
    private int peso;
    private int ideT;

    public Tesoro(String nombre, int vHistorico, int peso, int ideT) {
        this.nombre = nombre;
        this.vHistorico = vHistorico;
        this.peso = peso;
        this.ideT = ideT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getvHistorico() {
        return vHistorico;
    }

    public void setvHistorico(int vHistorico) {
        this.vHistorico = vHistorico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdeT() {
        return ideT;
    }

    public void setIdeT(int ideT) {
        this.ideT = ideT;
    }

    public String toString() {
        return this.nombre;
    }

    public int compareTo(Tesoro o) {
        /*if (this.vHistorico > o.vHistorico) {
            return this.vHistorico - o.vHistorico;
        } else if (this.vHistorico < o.vHistorico) {
            return o.vHistorico - this.vHistorico;
        } else{
            if (this.peso > o.peso) {
                return this.peso - o.peso;
            }else if(this.peso < o.peso) {
                return o.peso - this.peso;
            } else {
                return this.ideT - o.ideT;
            }
        }*/
        if (this.vHistorico == o.vHistorico && this.peso == o.peso) {
            return this.ideT - o.ideT;
        } else if (this.vHistorico == o.vHistorico) {
            return this.peso - o.peso;
        } else {
            return o.vHistorico - this.vHistorico;
        }
    }
}
