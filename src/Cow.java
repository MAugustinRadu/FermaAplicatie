public class Cow extends Animals {
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("cow.mp3");
        System.out.println("Mooooo");
    }

    @Override
    public void move() {
        int moveDistance = 3;
        System.out.println("I can move " + moveDistance + " tiles");
    }
}
