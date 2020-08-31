package lesson16;

public class Part2 {
    public static void main(String[] args) {
        Person pr1= new Person();
        try{
            pr1 =new Person("Darya",30);
        }catch(ArithmeticException zz){
            System.out.println("!!!Age is wrong");
        }
        try {
            pr1.setAge(181);
        } catch(ArithmeticException zz){
            System.out.println("!!!Set age is wrong");
        }
    }
}
