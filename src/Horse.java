public class Horse extends Animals{
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("horse.mp3");
        System.out.println("Neighh, Neighh");
    }

    @Override
    public void move() {
        int moveDistance = 7;
        System.out.println("I can move " + moveDistance + " tiles");
    }
}
