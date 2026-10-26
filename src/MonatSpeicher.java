import java.io.*;

public class MonatSpeicher {

    public static void speichern(Monat monat) {

        String dateiname = monat.getMonat() + ".dat";

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(dateiname))) {

            out.writeObject(monat);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Monat laden(String monat) {

        String dateiname = monat + ".dat";

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(dateiname))) {

            return (Monat) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}