import java.util.Scanner;

public class StromkostenApp {
    private Scanner scanner = new Scanner(System.in);
    private Monat aktuellerMonat;
    Laptop laptop = new Laptop(5.5, 170);

    public void starten() {
        boolean läuft = true;
        while (läuft) {
            menueAnzeigen();

            String auswahl = scanner.nextLine();

            switch (auswahl) {
                case "1":
                    monatAnlegen();
                    break;
                case "2":
                    monatLaden();
                    break;
                case "3":
                    monatSpeichern();
                    break;
                case "4":
                    stromBerechnen();
                case "0":
                    läuft = false;
                    break;
                default:
                    System.out.println();
            }
        }
    }

    private void menueAnzeigen() {
        System.out.println();
        System.out.println("===Stromkosten===");
        if (aktuellerMonat != null) {
            System.out.println("Aktueller Monat: " + aktuellerMonat.getMonat());
        }
        System.out.println();
        System.out.println("1 - Monat anlegen");
        System.out.println("2 - Monat laden");
        System.out.println("3 - Monat speichern");
        System.out.println("0 - Beenden");
        System.out.println("Auswahl: ");
    }

    private void monatAnlegen() {
        System.out.println("Monat: ");
        String name = scanner.nextLine();

        aktuellerMonat = new Monat(name);

        System.out.println(name + " wurde angelegt.");
    }

    private void monatLaden() {
        System.out.println("Welchen Monat möchtest du laden? ");
        String name = scanner.nextLine();

        aktuellerMonat = MonatSpeicher.laden(name);

        if (aktuellerMonat != null) {
            System.out.println(aktuellerMonat.getMonat() + " wurde geladen.");
        }
    }

    private void monatSpeichern() {
        if (aktuellerMonat == null) {
            System.out.println("Kein Monat ausgewählt.");
            return;
        }
        MonatSpeicher.speichern(aktuellerMonat);

        System.out.println(aktuellerMonat.getMonat() + " wurde gespeichert.");
    }

    private void stromBerechnen() {
        Calculator.stromkostenRechner(laptop, Strompreis.getInstance());
    }
}
