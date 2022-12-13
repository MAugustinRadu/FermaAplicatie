import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SoundsOfAnimals {

    public static void soundOfAnimals(String filename){
        try {
            FileInputStream fos = new FileInputStream(filename);
            BufferedInputStream bof = new BufferedInputStream(fos);

            Player player = new player(fos);
            Player.play();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }

    }
}
