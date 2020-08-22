package hw12;

public class PictureFrame implements Frame {
    private String Shape;
    private Materials material;
    private int height;


    public void angle() {
        System.out.println("Iron angles.");
    }
    public void glass() {
        System.out.println("Protective glass.");

    }
    public void picture() {
        System.out.println("Abstract picture.");
    }

    public PictureFrame(String shape, Materials material, int height) {
        Shape = shape;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return  Shape+" PICTURE-FRAME INFORMATION:" +
                "Shape='" + Shape + '\'' +
                ", material= " + material +
                ", height= " + height +
                ".";
    }
}
