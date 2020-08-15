public class HW7 {
    public static void main(String[] args) {
//
//        int []first = {2,3,5,6,7,8};
//        System.out.println(sum(first));

        int []sortBy = {3,9,1,8,4,8,5};


//
//
//        int[] sorting = {3,9,1,8,4,8,5};
//        System.out.println(max1(sorting));
//        System.out.println((min1(sorting)));
//



    }

    public static int sum (int[]aa){
        int sum = 0;
        for (int v:aa){
            sum+=v;
        }
        return sum;

    }

    public static void sort (int[]bb) {
        int a = bb[0];
        for (int v : bb) {
            if (v < a) {
                a = v;}




        }
        }




    public static int max1 (int[]y){
        int max1 = y[0];
        for (int v: y) {
            if (v>max1){
                max1=v;
            }
        }
        return max1;

    }

    public static int min1 (int[]r){
        int min1 = r [0];
        for (int v: r){
            if (v<min1){
                min1 = v;

            }
        }
        return min1;
    }


}
