public class Frog extends Animals{
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("frog.mp3");
        System.out.println("Ribbit, Ribbit");
    }

    @Override
    public void move() {
        int moveDistance = 1;
        System.out.println("I can move " + moveDistance + " tiles");
    }
}
