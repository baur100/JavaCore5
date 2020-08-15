package hw2;

//a=100; x=12; d=12; c=122; Find zz
/*a. zz1 = a==d // false
b. zz2 = x==d
c. zz3 = c>=a
d. zz4 = x>=d
e. zz5 = (d==c) || (x==d)
f. zz6 = (c>x) && (d>=x)
g. zz7 = (a>x) || (a>c)
h. zz8 = (a==c) && (d==c)
i. zz9 = (c==c) && (a>=a)
j. zz0 = (c>c) || (a<=a)
k. zz10 = (x>a) && (c==d)
l. zz11 = (c>a) && (x>d)*/

public class App {

    public static void main(String[] args) {

        int a = 12;
        int b = 15;

        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

        int num = 13;
        int sum = 26;

        if (num >= sum) {

            System.out.println("they are equal");

        } else {
            System.out.println("they are not equal");
        }
    }
}