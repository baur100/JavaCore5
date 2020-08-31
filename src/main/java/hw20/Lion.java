package hw20;

public class Lion extends Carnivores {
    private String name;
    private String size;

    public Lion(String food,String name,String size) {
        super(food);
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void food() {
        System.out.println("Im prefered to fresh food ");
    }

    @Override
    public void warmblood() {
        System.out.println("");

    }

    @Override
    public void brain() {
        System.out.println("I have big a brain ");

    }

    @Override
    public void nerves() {
        System.out.println("im nervios ");

    }

    @Override
    public void touch() {
        System.out.println("Dont touch me!!! ");

    }

    @Override
    public void breathe() {
        System.out.println("I can breathe ");

    }

    @Override
    public void death() {
        System.out.println("Im not ready to death ");

    }

    @Override
    public void breed() {
        System.out.println("Hey Girls!!! ");

    }

    @Override
    public void eat() {
        System.out.println("Im eat a lot ");

    }
}
