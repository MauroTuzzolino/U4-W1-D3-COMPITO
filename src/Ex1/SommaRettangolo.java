package Ex1;

public class SommaRettangolo {
    RettangoloAreaPerimetro calcoloRettangolo = new RettangoloAreaPerimetro();

    public double sommaPerimetri(double p1, double p2) {
        return p1 + p2;
    }

    public double sommaAree(double a1, double a2) {
        return a1 + a2;
    }

    public void stampaDueRettangoli(double p1, double p2, double a1, double a2) {
        double sommaPerimetri = sommaPerimetri(p1, p2);
        double sommaAree = sommaAree(a1, a2);

        System.out.println("La somma dei perimetri è: " + sommaPerimetri);
        System.out.println("La somma delle aree è: " + sommaAree);
    }

}
