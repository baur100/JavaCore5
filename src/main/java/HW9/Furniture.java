package HW9;

import java.util.Arrays;

public class Furniture {

    private String material;
    private String purpose;
    private AssemblyParts[] assemblyParts;

    public Furniture(String material, String purpose, AssemblyParts[] assemblyParts) {
        this.material = material;
        this.purpose = purpose;
        this.assemblyParts = assemblyParts;
    }

    public Furniture(){}


    public String getMaterial() {
        return material;
    }

    public String getPurpose() {
        return purpose;
    }

    public AssemblyParts[] getAssemblyParts() {
        return assemblyParts;
    }


    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setAssemblyParts(AssemblyParts[] assemblyParts) {
        this.assemblyParts = assemblyParts;
    }
@Override
    public String  toString () {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", purpose='" + purpose + '\'' +
                ", assemblyParts=" + Arrays.toString(assemblyParts) +
                '}';


    }
}
