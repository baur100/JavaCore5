package HW9;

import java.util.Arrays;

public class Equipment {

    private String purpose;
    private String material;
    private Dimentions[] dimentions;


    public Equipment(String purpose, String material, Dimentions[] dimentions) {
        this.purpose = purpose;
        this.material = material;
        this.dimentions = dimentions;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getMaterial() {
        return material;
    }

    public Dimentions[] getDimentions() {
        return dimentions;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDimentions(Dimentions[] dimentions) {
        this.dimentions = dimentions;
    }



    public void printEquipmentInfo() {
        System.out.println("Equipment{" +
                "purpose='" + purpose + '\'' +
                ", material='" + material + '\'' +
                ", dimentions=" + Arrays.toString(dimentions) +
                '}');

        for(Dimentions v: dimentions){
            System.out.println(v);
        }
    }

}
