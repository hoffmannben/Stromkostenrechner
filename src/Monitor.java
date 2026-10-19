public class Monitor {
    private double kwh;
    private double laufzeit;


    public Monitor(double kwh, double laufzeit) {
        this.kwh = kwh;
        this.laufzeit = laufzeit;
    }

    public double getKwh() {
        return kwh;
    }
    public double getLaufzeit() {
        return laufzeit;
    }

    public void setKwh(double kwh) {
        this.kwh = kwh;
    }
    public void setLaufzeit(double laufzeit) {
        this.laufzeit = laufzeit;
    }
}
