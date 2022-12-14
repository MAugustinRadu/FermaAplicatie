public class Cow extends Animals {
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("cow.mp3");
        System.out.println("Mooooo");
    }
}
