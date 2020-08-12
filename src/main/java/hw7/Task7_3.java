package hw7;

// Создайте метод, который в качестве аргумента берет int[] и возвращает максимальное/минимальное значение
//(группа мак - макчимальное/ группа win - минимальное)
//подайте в качестве параматра {3,9,1,8,4,8,5}
public class Task7_3 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 8, 4, 8, 5};

        System.out.println("Maximum value of array is: " + maxValueInArray(arr));
        System.out.println("Minimum value of array is: " + minValueInArray(arr));

    }

    public static int maxValueInArray(int[] xx) {
        int max = xx[0];

        for (int v : xx) {
            if (v > max) {
                max = v;

            }
        }
        return max;
    }

    public static int minValueInArray(int[] xx) {
        int min = xx[0];
        for (int v : xx) {
            if (v < min) {
                min = v;

            }
        }
        return min;
    }
}
