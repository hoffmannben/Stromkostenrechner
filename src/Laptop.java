public class Laptop {
    private double laufzeit;
    private double kwh;

    public Laptop(double laufzeit, double kwh) {
        this.laufzeit = laufzeit;
        this.kwh = 170;
    }

    public double getLaufzeit() {
        return laufzeit;
    }
    public void setLaufzeit(double laufzeit) {
        this.laufzeit = laufzeit;
    }
    public double getKwh() {
        return kwh;
    }
    public void setKwh(double kwh) {
        this.kwh = kwh;
    }
}
