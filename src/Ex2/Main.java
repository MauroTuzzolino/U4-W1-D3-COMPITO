package Ex2;

public class Main {
    public static void main(String[] args) {
        SIM miaSim = new SIM("123-456-7890");

        miaSim.aggiungiChiamata(new Chiamata("987-654-3210", 2));
        miaSim.aggiungiChiamata(new Chiamata("222-333-4444", 5));
        miaSim.aggiungiChiamata(new Chiamata("123-987-6540", 1));
        miaSim.aggiungiChiamata(new Chiamata("343-454-5656", 0.30));
        miaSim.aggiungiChiamata(new Chiamata("121-222-3134", 4));
        //miaSim.aggiungiChiamata(new Chiamata("145-637-8909", 10.40));

        miaSim.stampaDati();
    }
}
