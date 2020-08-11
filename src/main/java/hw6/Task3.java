package hw6;

public class Task3 {
//Создайте метод isEven - который в качестве аргумента берет целое число и если оно четное возвращает true
//если нечетное - возвращает false
//вызовите этот метод внутри функии main(), сохраните результат в переменной и выведите результат на экран
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,4,8,5,7,3,2,4,7};

        for (int v: arr){
            if (isEven(v)){
                System.out.println(v);
            }
        }

    }

    public static boolean isEven(int number){
        if(number%2 == 0){
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
        return false;
    }
}
