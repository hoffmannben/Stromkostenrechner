public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(5.5,0.170);
        Monitor monitor = new Monitor(0.050,5.5);
        System.out.println(Calculator.stromkostenRechner(laptop,Strompreis.getInstance()));
    }
}
