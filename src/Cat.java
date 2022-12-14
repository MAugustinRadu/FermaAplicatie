public class Cat extends Animals {
    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("cat.mp3");
        System.out.println("Miaw");
    }

    @Override
    public void move() {
        int moveDistance = 3;
        System.out.println("I can move " + moveDistance + " tiles");
    }
}
