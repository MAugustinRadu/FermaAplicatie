public class Main {

    private final int MAXANIMALS = 10;
    private Animals[] animalsInYard = new Animals[MAXANIMALS];

    private void addAnimal() {
        animalsInYard[0] = new Dog();
        animalsInYard[1] = new Cat();
        animalsInYard[2] = new Cat();
        animalsInYard[3] = new Cow();
    }

    private void playAnimalsSounds() {

    }
    
    private void moveAnimals() {
        for (int i = 0; i < animalsInYard.length; i++) {
            if (animalsInYard[i] != null) {
                animalsInYard[i].move();
            }
        }
    }
    public static void main(String[] args) {
        Main ay = new Main();
        ay.addAnimal();
        ay.playAnimalsSounds();
        ay.moveAnimals();
        
    }
}