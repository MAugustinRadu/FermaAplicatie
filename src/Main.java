public class Main {

    private final int MAXANIMALS = 10;
    private Animals[] animalsInYard = new Animals[MAXANIMALS];

    private void addAnimal() {
        animalsInYard[0] = new Wolf();
        animalsInYard[1] = new Cat();
        animalsInYard[2] = new Horse();
        animalsInYard[3] = new Cow();
        animalsInYard[4] = new Cricket();
        animalsInYard[5] = new Frog();
    }

    private void playAnimalsSounds() {
        for (int i = 0; i < animalsInYard.length; i++) {
            if (animalsInYard[i] != null) {
                animalsInYard[i].sound();
            }
        }
    }
    
    private void moveAnimals() {
        for (int i = 0; i < animalsInYard.length; i++) {
            if (animalsInYard[i] != null) {
                animalsInYard[i].move();
            }
        }
    }

    private void moveAndPlayAnimals() {
        for (int i = 0; i < animalsInYard.length; i++) {
            if (animalsInYard[i] != null) {
                animalsInYard[i].sound();
                animalsInYard[i].move();
            }
        }
    }
    public static void main(String[] args) {
        Main ay = new Main();
        ay.addAnimal();
        ay.moveAndPlayAnimals();
        
    }
}