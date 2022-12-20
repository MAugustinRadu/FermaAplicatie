public class Wolf extends WildAnimals{


    @Override
    void sound() {
        SoundsOfAnimals.soundOfAnimals("wolf.mp3");
        System.out.println("Howwwwllll");
    }

    @Override
    public void move() {
        int moveDistance = 7;
        System.out.println("I can move " + moveDistance + " tiles");
    }

}
