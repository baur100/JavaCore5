package hw20;

public abstract class Carnivores implements Mammals {
    protected String food;

    public Carnivores(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public abstract void food();
}
