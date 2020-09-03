package lesson16;

import org.w3c.dom.ranges.RangeException;

public class App {
    public static void main(String[] args) {
        int x=1;
        int[] arr = {1,1};

        try{
            System.out.println("Code before error");
//            x = 5/0;
//            arr[4]=2;
            System.out.println("Code after error");
        } catch(ArithmeticException xx){
            System.out.println("Exception happens");
            x=-1;
        } catch (ArrayIndexOutOfBoundsException xx){
            System.out.println("Wrong array index "+xx.getMessage());
        } catch (Exception err){
            System.out.println("Unknown error happens => " + err.getClass()+" "+err.getMessage());
        } finally {
            System.out.println("Will run in any case");
        }
        System.out.println(x);
        System.out.println("program finished");
    }

    public int checkNumber(int number){
        if (number<=0) {
            throw new ArithmeticException("Only positive");
        }
        return number;
    }






}
