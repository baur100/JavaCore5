package HW9;

import javax.naming.spi.DirectoryManager;

public class App9 {

    public static void main(String[] args) {

        Animals bullDog = new Animals();
        Vaccines[] vaccines2 ={Vaccines.FEAWER, Vaccines.OSPA};
        bullDog.setVaccinesDone(vaccines2);
        bullDog.setAge(34);
        bullDog.setColor("green");
        System.out.println(bullDog.toString());
        bullDog.setColor("yellow");
        System.out.println(bullDog.getColor());


        bullDog.printArrayVaccines(vaccines2);


        Vaccines[] vaccinesDone = {Vaccines.FEAWER, Vaccines.CORONAVIRUS};
        Animals chihuaHua = new Animals("white", 12, vaccinesDone);
        System.out.println(chihuaHua.toString());
        chihuaHua.setColor("grey");
        System.out.println(chihuaHua.getColor());


        Furniture table = new Furniture();
        table.setMaterial("metal");
        table.setPurpose("productionFurniture");
        System.out.println(table.toString());


        AssemblyParts[] assemblyParts ={AssemblyParts.BOLTS, AssemblyParts.SCROVES, AssemblyParts.METAL};
        Furniture chair = new Furniture("wood", "constraction",assemblyParts);
        chair.setPurpose("sitting");
        chair.setMaterial("plastic");
        System.out.println(chair.toString());

        Equipment saw = new Equipment();
        saw.setPurpose("constraction");
        System.out.println(saw.getPurpose());
        System.out.println(saw.toString());


//        Dimentions[] dimentions ={Dimentions.SUPERSMALL, Dimentions.LARGE, Dimentions.MEDIUM};
//        Equipment hammer = new Equipment("makeFurniture", "Plastic",dimentions);
//        System.out.println(hammer.toString());

    }


}
