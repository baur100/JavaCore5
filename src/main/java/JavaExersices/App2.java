package JavaExersices;

public class App2 {
    public static void main(String[] args) {
        int xx = 100;
        fizzbuzz(xx);
    }

    private static void fizzbuzz(int xx) {
        for (int i = 0; i<xx;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if(i%5==0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
