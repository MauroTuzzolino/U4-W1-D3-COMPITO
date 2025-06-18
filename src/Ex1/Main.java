package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RettangoloAreaPerimetro calcoloRettangolo = new RettangoloAreaPerimetro();
        SommaRettangolo sommaRettangoli = new SommaRettangolo();

        System.out.println("Inserire il primo lato del rettangolo: ");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserire il secondo lato del rettangolo:");
        double lato2 = scanner.nextDouble();

        calcoloRettangolo.stampaRettangolo(lato1, lato2);

        System.out.println("Ora creiamo un nuovo rettangolo!");
        System.out.println("Inserisci il primo lato del nuovo rettangolo: ");
        double lato3 = scanner.nextDouble();

        System.out.println("Inserisci il secondo lato del nuovo rettangolo: ");
        double lato4 = scanner.nextDouble();

        calcoloRettangolo.stampaRettangolo(lato3, lato4);

        sommaRettangoli.stampaDueRettangoli(calcoloRettangolo.perimetro(lato1, lato2), calcoloRettangolo.perimetro(lato3, lato4), calcoloRettangolo.area(lato1, lato2), calcoloRettangolo.area(lato3, lato4));

    }
}
