package HW9;

public class App9 {

    public static void main(String[] args) {


        Animals bullDog = new Animals();
        bullDog.setAge(34);
        System.out.println(bullDog.getAge());

        Animals chihuaHua = new Animals("black", 12, Vaccines.FLY, Vaccines.CORONAVIRUS);

        Furniture table = new Furniture();
        table.setMaterial("metal");
        System.out.println(table.getMaterial());
        Furniture chair = new Furniture("wood", "ooficeUse", AssemblyParts.WOOD, AssemblyParts.SCROVES);

        Equipment saw = new Equipment();
        saw.setPurpose("constraction");
        System.out.println(saw.getPurpose());

        Equipment hammer = new Equipment("makeFurniture", "Plastic", Dimentions.SMALL, Dimentions.SUPERSMALL);


    }





}