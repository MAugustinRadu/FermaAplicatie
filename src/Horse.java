public class Horse extends Animals{
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("horse.mp3");
        System.out.println("Neighh, Neighh");
    }
}
