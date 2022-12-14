public class Cricket extends Animals{
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("cricket.mp3");
        System.out.println(":Cricket:Cricket:");
    }

    @Override
    public void move() {
        int moveDistance = 1;
        System.out.println("I can move " + moveDistance + " tiles");
    }
}
