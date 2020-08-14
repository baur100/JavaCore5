package work8;

public class Work81 {
    public static void main(String[] args) {
        SchoolType lincolnHigh = SchoolType.PUBLIC;
        SchoolType fatherCappodano = SchoolType.PRIVATE;
        SchoolType allDistrictElementary = SchoolType.CHARTER;

        Direction lincSCH = Direction.NORTH;
        Direction fathCapSchool = Direction.WEST;
        Direction allDistrict = Direction.SOUTH;

        lincSCH=Direction.WEST;
        System.out.println(lincSCH);

        System.out.println(lincolnHigh);
        System.out.println(fatherCappodano);
        System.out.println(allDistrictElementary);


        Fruits[] dieta = {Fruits.APPLE,Fruits.STAR_FRUIT, Fruits.LEMON, Fruits.AVOCADO};
        for (Fruits v : dieta){
            System.out.println(v);
        }

        Size[] t_shirt = {Size.L, Size.S, Size.M};


//        String[] t_shirt1 = {"Large", "S", "m"};

    }
}
