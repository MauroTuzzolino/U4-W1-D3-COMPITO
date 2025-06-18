package Ex1;

public class RettangoloAreaPerimetro {
    public double perimetro(double l1, double l2) {
        return (l1 + l2) * 2;

    }

    public double area(double l1, double l2) {
        return l1 * l2;
    }

    public void stampaRettangolo(double l1, double l2) {
        double perimetro = perimetro(l1, l2);
        double area = area(l1, l2);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
