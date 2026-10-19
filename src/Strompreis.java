public class Strompreis {
   private static final Strompreis instance = new Strompreis();

   private double preis = 0.32;

   private Strompreis() {
   }
   public static Strompreis getInstance() {
       return instance;
   }
   public double getPreis() {
       return preis;
   }
   public void setPreis(double preis) {
       this.preis = preis;
   }
}
