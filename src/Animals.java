public abstract class Animals {
    int health = 10;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void sound();

    public void move() {
        System.out.println("Moving generic");
    }
}
