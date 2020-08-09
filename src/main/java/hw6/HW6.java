package hw6;

public class HW6 {


    public static void main(String[]args){
        int xx = sum_of_two_numbers(7,8);

        numbers();

        System.out.println(xx);

        int[] arr = {1,4,6,9,10,17,20,44,55};

        for (int v: arr){
            if (isEven(v)){
                System.out.println(v);
            }

        }
        
    }

    public static void numbers(){
        System.out.println("7");
        System.out.println("8");
    }

    public static int sum_of_two_numbers(int a, int b) {
        int result = (a+b);
        return result;




    }

    public static boolean isEven(int number){
        if(number%2==1){
            return true;
        } else {
            return false;
        }
    }

}
