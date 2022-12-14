public class Cricket extends Animals{
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("cricket.mp3");
        System.out.println(":Cricket:Cricket:");
    }
}
