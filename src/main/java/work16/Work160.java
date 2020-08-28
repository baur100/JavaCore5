package work16;

import org.w3c.dom.ranges.RangeException;

public class Work160 {
    public static void main(String[] args) {

        int x = 1;
        int[] arr = {1, 1};

        try {
            System.out.println("Code before error");
//            x = 5 / 0;  // Arifmetic exception
//
//            arr[4] = 2;

//            throw new RangeException((short)1,"Wrong-Wrong");

//            System.out.println("Code after error");
        } catch (ArithmeticException xx) {

            System.out.println("Exception happens");
            x = -1;
        } catch (ArrayIndexOutOfBoundsException xx) {

            System.out.println("Wrong array index" + xx.getMessage());
        }catch (Exception err){
            System.out.println("Unknown error hapens =>"+err.getClass()+" "+err.getMessage());
        } finally {
            System.out.println("Will run in any case");
        }


        System.out.println(x);
        System.out.println("Program finished");

    }

    public int checkNumber(int number){
        if (number<=0){
            throw new ArithmeticException("Only positive");
        }
        return number;
    }

//    public boolean checkAge(int age){
//        if (age<21){
//            throw new IllegalAccessException("Wrong age");
//        }
//        return age;
//    }


}
