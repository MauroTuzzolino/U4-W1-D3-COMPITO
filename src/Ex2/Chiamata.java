package Ex2;

public class Chiamata {
    private String numeroChiamato;
    private double durata;

    public Chiamata(String numeroChiamato, double durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public double getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Chiamata verso " + numeroChiamato + "di " + durata + " minuti.";
    }
}
