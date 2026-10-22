public class Calculator {
    public static double stromkostenRechner(Laptop laptop) {
    double kosten;
    double kwh = laptop.getKwh();
    double laufzeit = laptop.getLaufzeit();
    kosten = kwh * laufzeit;
        return kosten;
    }

    public static double stromkostenRechner( Laptop laptop, Monitor monitor) {
        double kosten;
        double kwh = laptop.getKwh() + monitor.getKwh();
        double laufzeit = laptop.getLaufzeit() +  monitor.getLaufzeit();
        kosten = kwh * laufzeit;
        return kosten;
    }
}
