package lesson16;

import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ranges.RangeException;

public class Part1 {
    public static void main(String[] args) {  //Особо опасный код запихиваем в try{} and catch{}
        int r = 1;                                   // любая ошибка в ходе препятствует ее дальнейшей работе
        int[] arr = {1, 3};

        try {
            System.out.println("Code before error"); // до exception код работает
            //  r = 5 / 0;
            // arr[4]=2;
            throw new RangeException((short) 1, "I'm mistake");

            // System.out.println("Code after error"); // после exception код не работает
        } catch (ArithmeticException xx) {  // в скобках указываем нужный тип ошибки
            System.out.println("!!!Exception happens"); // вывод если ошибка найдена, error message
            r = -1;
        } catch (ArrayIndexOutOfBoundsException xx) {
            System.out.println("!!!Wrong array index" + xx.getMessage());
        } catch (Exception xx) {
            System.out.println("!!!Unknown error");
        }finally {
            System.out.println("Will run in any case");
        }
      Person pr = new Person("Ivan", 14);
        try {
            pr.setAge(144);
        }catch (ArithmeticException err){   //ошибки в обекте нужно закладывать в самом классе обьекта
        System.out.println("!!!Age is wrong");}
        //int b=6/0;
        System.out.println(r);
        System.out.println("Program finished");
    }

        public int checkNumber(int nm){
            if (nm <= 0) {
                throw new ArithmeticException("Only positive");
            }
            return nm;
        }

        //public boolean checkAge(int Age){
//        if(Age<21){
//            throw new IllegalAccessException("Wrong age!");
//        }
//        return true;

    }




