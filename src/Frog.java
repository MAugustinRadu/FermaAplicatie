public class Frog extends Animals{
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("frog.mp3");
        System.out.println("Ribbit, Ribbit");
    }
}
