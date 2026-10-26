import java.io.Serializable;

public class Monat implements Serializable {
    private String monat;
    private double Geld;
    private int Jahr;

    public Monat(String monat) {
        this.monat = monat;
        this.Geld = 0;
        this.Jahr = 0;
    }

    public String getMonat() {
        return monat;
    }
    public double getGeld() {
        return Geld;
    }
    public int getJahr() {
        return Jahr;
    }

    public void setMonat(String monat) {
        this.monat = monat;
    }
    public void setGeld(double geld, Monat monat) {
        this.Geld = geld + monat.getGeld();
    }
    public void setJahr(int jahr) {
        this.Jahr = jahr;
    }
}
