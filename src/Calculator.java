public class Calculator {
    public static double stromkostenRechner(Laptop laptop, Strompreis strompreis) {
    double kosten;
    double stromkosten = strompreis.getPreis();
    double kwh = laptop.getKwh();
    double laufzeit = laptop.getLaufzeit();
    kosten = (kwh * laufzeit * stromkosten)/1000;
        return kosten;
    }

    public static double stromkostenRechner( Laptop laptop, Monitor monitor, Strompreis strompreis) {
        double kosten;
        double stromkosten = strompreis.getPreis();
        double kwh = laptop.getKwh() + monitor.getKwh();
        double laufzeit = laptop.getLaufzeit() +  monitor.getLaufzeit();
        kosten = (kwh * laufzeit * stromkosten)/1000;
        return kosten;
    }
}
