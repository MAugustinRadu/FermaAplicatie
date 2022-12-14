public class Cat extends Animals {
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("cat.mp3");
        System.out.println("Miaw");
    }
}
