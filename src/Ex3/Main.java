package Ex3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("C001", "Mario Rossi", "mario.rossi@email.com", "2025-06-18");

        Articolo articolo1 = new Articolo("A001", "Laptop", 799.99, 10);
        Articolo articolo2 = new Articolo("A002", "Mouse Wireless", 25.50, 50);

        Carrello carrello = new Carrello(cliente1, 10); // max 10 articoli

        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);

        carrello.mostraCarrello();
    }
}