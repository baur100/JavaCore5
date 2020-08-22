package hw12;

public class Part1 {
    public static void main(String[] args) {
        // Обычные обекты
//        FotoFrame ff1= new FotoFrame("Square","Gold","Yes");
//        ff1.infoFotoFrame();
//        FotoFrame ff2=new FotoFrame("Hexagonal","Black wood","122");
//        ff2.infoFotoFrame();
//
//        PictureFrame pf1=new PictureFrame("Pentagon",Materials.METAL,80);
//        System.out.println(pf1);
//        PictureFrame pf2=new PictureFrame("Angle",Materials.PLASTIC, 35);

        Frame ff11= new FotoFrame("Octagon","Gold","Yes");
        Frame ff22= new FotoFrame("Angle","Black","NO");
        Frame pf11= new PictureFrame("Square",Materials.WOOD,43);
        Frame pf22=new PictureFrame("Hexagonal",Materials.PLASTIC, 90);

        ff11.angle();
        ff22.angle();
        pf11.angle();
        pf22.angle();

        ff11.picture();
        pf22.picture();
    }
}
