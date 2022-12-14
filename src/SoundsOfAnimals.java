import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class SoundsOfAnimals {

    public static void soundOfAnimals(String filename){
        try {
            // primeste numele unui mp3 de pe disk
            FileInputStream fos = new FileInputStream(filename);
            BufferedInputStream bof = new BufferedInputStream(fos);

            Player player = new Player(fos);
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
