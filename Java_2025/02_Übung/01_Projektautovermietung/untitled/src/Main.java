
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();

        fahrzeuge.add(new Auto("BMW", "3er", 70, 5));
        fahrzeuge.add(new Transporter("Mercedes", "Sprinter", 120, 10));

        System.out.println("Verfügbare Fahrzeuge:");
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f.toString());
        }

        int mietTage = 3;
        System.out.println("\nMietpreise für " + mietTage + " Tage:");
        for (Fahrzeug f : fahrzeuge) {
            double gesamtpreis = f.getTagespreis() * mietTage;
            System.out.println(f.getMarke() + " " + f.getModell() + ": " + gesamtpreis + "€");
        }
    }
}
