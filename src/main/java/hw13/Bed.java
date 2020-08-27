package hw13;

import java.util.Arrays;

public class Bed {
    private String frame;
    private BedSizes[] sizes;
    private int numbersOfSprings;
    private String mattressType;

    public Bed(String frame, BedSizes[] sizes, int numbersOfSprings, String mattressType) {
        this.frame = frame;
        this.sizes = sizes;
        this.numbersOfSprings = numbersOfSprings;
        this.mattressType = mattressType;
    }

    public Bed() {
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public BedSizes[] getSizes() {
        return sizes;
    }

    public void setSizes(BedSizes[] sizes) {
        this.sizes = sizes;
    }

    public int getNumbersOfSprings() {
        return numbersOfSprings;
    }

    public void setNumbersOfSprings(int numbersOfSprings) {
        this.numbersOfSprings = numbersOfSprings;
    }

    public String getMattressType() {
        return mattressType;
    }

    public void setMattressType(String mattressType) {
        this.mattressType = mattressType;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "frame='" + frame + '\'' +
                ", sizes=" + Arrays.toString(sizes) +
                ", numbersOfSprings=" + numbersOfSprings +
                ", mattressType='" + mattressType + '\'' +
                '}';
    }
}
