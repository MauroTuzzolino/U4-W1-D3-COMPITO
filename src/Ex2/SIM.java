package Ex2;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private Chiamata[] listaChiamate;
    private int numeroChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.listaChiamate = new Chiamata[5];
        this.numeroChiamate = 0;
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        if (numeroChiamate < 5) {
            listaChiamate[numeroChiamate] = chiamata;
            numeroChiamate++;
        } else {
            for (int i = 0; i < 4; i++) {
                listaChiamate[i] = listaChiamate[i + 1];
            }
            listaChiamate[4] = chiamata;
        }
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime chiamate effettuate:");
        if (numeroChiamate == 0) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (int i = 0; i < numeroChiamate; i++) {
                System.out.println(listaChiamate[i]);
            }
        }
    }
}
