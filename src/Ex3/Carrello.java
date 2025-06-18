package Ex3;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] articoli;
    private int numeroArticoli;

    public Carrello(Cliente clienteAssociato, int dimensioneMassima) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = new Articolo[dimensioneMassima];
        this.numeroArticoli = 0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        if (numeroArticoli < articoli.length) {
            articoli[numeroArticoli] = articolo;
            numeroArticoli++;
        } else {
            System.out.println("Carrello pieno! Impossibile aggiungere altri articoli.");
        }
    }

    public double calcolaTotale() {
        double totale = 0;
        for (int i = 0; i < numeroArticoli; i++) {
            totale += articoli[i].getPrezzo();
        }
        return totale;
    }

    public void mostraCarrello() {
        System.out.println("Cliente: " + clienteAssociato.getNomeCognome());
        System.out.println("Articoli nel carrello:");
        for (int i = 0; i < numeroArticoli; i++) {
            System.out.println("- " + articoli[i].getDescrizioneArticolo() + " : €" + articoli[i].getPrezzo());
        }
        System.out.println("Totale: €" + calcolaTotale());
    }
    
}
