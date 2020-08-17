package HW9;

import javax.naming.spi.DirectoryManager;

public class App9 {

    public static void main(String[] args) {


        Animals bullDog = new Animals();
        bullDog.setAge(34);
        System.out.println(bullDog.getAge());
        bullDog.printAnimalsInfo();

        Animals chihuaHua = new Animals("white", 12);
        Vaccines[] vaccines = {Vaccines.FEAWER, Vaccines.CORONAVIRUS};

        Furniture table = new Furniture();
        table.setMaterial("metal");
        System.out.println(table.getMaterial());
        table.printFurnityreinfo();
        Furniture chair = new Furniture("wood", "constraction");
        AssemblyParts[] assemblyParts ={AssemblyParts.BOLTS, AssemblyParts.SCROVES};

        Equipment saw = new Equipment();
        saw.setPurpose("constraction");
        System.out.println(saw.getPurpose());
        saw.printEquipmentInfo();

        Equipment hammer = new Equipment("makeFurniture", "Plastic";
        Dimentions[] dimentions ={Dimentions.SUPERSMALL, Dimentions.LARGE};


    }


}
