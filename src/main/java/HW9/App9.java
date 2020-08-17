package HW9;

import javax.naming.spi.DirectoryManager;

public class App9 {

    public static void main(String[] args) {


        Animals bullDog = new Animals();
        bullDog.setAge(34);
        System.out.println(bullDog.getAge());
        bullDog.printAnimalsInfo();

        Vaccines[] vaccines = {Vaccines.FEAWER, Vaccines.CORONAVIRUS};
        Animals chihuaHua = new Animals("white", 12, vaccines);


        Furniture table = new Furniture();
        table.setMaterial("metal");
        System.out.println(table.getMaterial());
        table.printFurnityreinfo();

        AssemblyParts[] assemblyParts ={AssemblyParts.BOLTS, AssemblyParts.SCROVES};
        Furniture chair = new Furniture("wood", "constraction",assemblyParts);


        Equipment saw = new Equipment();
        saw.setPurpose("constraction");
        System.out.println(saw.getPurpose());
        saw.printEquipmentInfo();


        Dimentions[] dimentions ={Dimentions.SUPERSMALL, Dimentions.LARGE};
        Equipment hammer = new Equipment("makeFurniture", "Plastic",dimentions);

    }


}
