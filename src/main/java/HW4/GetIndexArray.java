package HW4;

public class GetIndexArray {

    public static void main(String[] args) {

        int[] arr = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        getIndex(arr);


    }

        public static void getIndex(int[] arr){

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 10) {
                    System.out.println(i);
                }
            }


    }
}