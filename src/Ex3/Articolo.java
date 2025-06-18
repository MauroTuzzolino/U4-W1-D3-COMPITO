package Ex3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int numeroPezziDisponibili;

    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    public void setNumeroPezziDisponibili(int numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }
}
