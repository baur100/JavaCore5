package work16;

public class work162 {
    public static void main(String[] args) {
        try {
            checkAge(50);
            System.out.println("Age is legal");
        } catch (IllegalAccessException e){
            System.out.println("Age is illegal to buy booze");
        }

    }

        public static boolean checkAge(int age) throws IllegalAccessException{
        if (age<21){
            throw new IllegalAccessException("Wrong age");
        }
        return true;


    }
}
