package hw8;

import java.sql.Types;
import java.util.Arrays;

public class hw8 {
    public static void main(String[] args) {
        Names nam = Names.ALISSIA;
        Names nam1 = Names.JECK;
        System.out.println(nam+" + "+nam1+" = Forever :)");


        TypesOfWeight type = TypesOfWeight.KG;
        TypesOfWeight type1 = TypesOfWeight.LB;
        TypesOfWeight type2 = TypesOfWeight.OZ;
        System.out.println(type+" European"+" Metric");
        System.out.println(type1+" USA");
        System.out.println(type2+" USA");

        TypesOfWeight[] arr = {TypesOfWeight.GRAM, TypesOfWeight.KG, TypesOfWeight.ML, TypesOfWeight.TON};
        System.out.println(Arrays.toString(arr));




    }
}
