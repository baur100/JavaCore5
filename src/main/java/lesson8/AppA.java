package lesson8;

public class AppA {
    public static void main(String[] args) {
        SchoolType lincolnHigh = SchoolType.PUBLIC;
        SchoolType fatherCappodano = SchoolType.PRIVATE;
        SchoolType allDistrictElementary = SchoolType.CHARTER;


        Direction fathCapSchool = Direction.EAST;
        Direction allDist = Direction.SOUTH;

        Direction lincSch = Direction.NORTH;
        lincSch=Direction.WEST;
        int x=5;
        x = 6;
        System.out.println(lincSch);

        System.out.println(lincolnHigh);
        System.out.println(fatherCappodano);
        System.out.println(allDistrictElementary);

        Fruits[] dieta = {Fruits.APPLE, Fruits.STAR_FRUIT, Fruits.LEMON,Fruits.AVOCADO};
        for (Fruits v : dieta) {
            System.out.println(v);
        }
        Size[] t_shirt = {Size.L,Size.S,Size.M};

        String[] t_shirt1 = {"Large","S","m"};

        final Direction northPole = Direction.NORTH;
//        northPole = Direction.EAST;

    }
}
