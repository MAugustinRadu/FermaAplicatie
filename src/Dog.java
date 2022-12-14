public class Dog extends Animals{

    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("dog.mp3");
        System.out.println("Bark, Bark");
    }

    @Override
    public void move() {
        int moveDistance = 5;
        System.out.println("I can move " + moveDistance + " tiles");
    }

}
