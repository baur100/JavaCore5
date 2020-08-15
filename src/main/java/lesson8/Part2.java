package lesson8;

public class Part2 {
    public static void main(String[] args) {
        Enum1 col=Enum1.GREEN;  // Enum создает новый ограниченный тип данных
        Enum1 col1=Enum1.BLUE;

        SchoolType LincolnHigh=SchoolType.PUBLIC;
        SchoolType FatherCappodano = SchoolType.PRIVATE;
        SchoolType allDistrictElementary = SchoolType.CHARTER;

        System.out.println(LincolnHigh);
        System.out.println(FatherCappodano);
        System.out.println(allDistrictElementary);

        Directions LincolSch=Directions.NORTH;
        Directions FtCappodano=Directions.EAST;
        Directions allDist=Directions.SOUTH;

        LincolSch= Directions.WEST;

        System.out.println(LincolSch);
    }
}
