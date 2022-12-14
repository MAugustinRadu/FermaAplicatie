public class Dog extends Animals{
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("dog.mp3");
        System.out.println("Bark, Bark");
    }

}
