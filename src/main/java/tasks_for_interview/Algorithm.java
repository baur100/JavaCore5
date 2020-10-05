package tasks_for_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm {
    public static void main(String[] args) {
        System.out.println("Algorithms");
        ///FizzBuzz

        for (var i = 1; i < 100; i++) {
            fizzBuzz(i);
            fizzBuzz1(i);
            fizzBuzz2(i);
        }
       ///GetRemainder
      int remainder = getRemainder(30,6);
        System.out.println("Remainder= "+remainder);

        int remainder1 = getRemainder1(30,7);
        System.out.println("Remainder= "+remainder1);

        ///Swap 2 variables
        int a=10;
        int b=20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);

        ///Lucky string or number (tyuiuyt)

        String str = "tyuiuyt";
        if(isLucky(str)){
            System.out.println(str+" is Lucky!");
        } else {
            System.out.println(str+" isn't Lucky!");
        }

        ///Reverse sentences
        final String sentence = "Today is a good day";
        reverseSentence(sentence);

        // Повторяющиеся числа в array
        int[] array = {5,5,6,7,8,9,6,0,5,9,2,3,1};
        printRepited(array);

        //Anagram
        String str1 = "Thing";
        String str2 = "Night";

        boolean check = isAnagram(str1, str2);
        System.out.println(check);

        //Разделение поискового запроса
        String xx = "https://www.google.com/search?rlz=1C5CHFA_enUS908US908&sxsrf=ALeKk03MX5pstSrmFY2r3lUOJm9vqpximA%3A1601598639474&ei=r3R2X4WkHLK0ytMPwpiV4Ak&q=java&oq=java&gs_lcp=CgZwc3ktYWIQAzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQRzIECAAQR1AAWABg9cUCaABwAngAgAEAiAEAkgEAmAEAqgEHZ3dzLXdpesgBCMABAQ&sclient=psy-ab&ved=0ahUKEwjFt-nv05TsAhUymnIEHUJMBZwQ4dUDCA0&uact=5";
        String[] spl = xx.split("\\?");
        String params = spl[1];
        String[] pr = params.split("&");
        for (String v: pr){
            System.out.println(v.split("=")[0]+": "+v.split("=")[1]);
        }

        //FizzBuzz.version2
        int zz = 100;
        fizzbuzz(zz);
    }

    //FizzBuzz.version2.Decision.
    private static void fizzbuzz(int zz) {
        for (int i=0; i<zz; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" fizzbuzz");
                continue;
            }
            if (i%3==0){
                System.out.println(i+" fizz");
                continue;
            }
            if (i%5==0){
                System.out.println(i+" buzz");
                continue;
            }
            System.out.println(i);
        }
    }

    //Anagram. Decision.
    private static boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }
        String normal1 = str1.toLowerCase();
        String normal2 = str2.toLowerCase();

        char[]word1=normal1.toCharArray();
        char[]word2=normal2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        for(int i=0; i<word1.length; i++){
            if (word1[i] != word2[i]){
                return false;
            }
            return true;
        }
        return false;
    }

    // Повторяющиеся числа в array. Decision.
    private static void printRepited(int[] array) {
        List repite = new ArrayList<Integer>();
        for (int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    if(!repite.contains(array[i]))
                    repite.add(array[i]);
                }
            }
        }
        repite.forEach(x-> System.out.println(x));
    }

    ///Reverse sentences. Decision.
    private static void reverseSentence(String sentence) {
        var words = sentence.split(" ");
        var reverse = "";
        for (var i=words.length-1; i>=0; i--){
        reverse+=words[i]+" ";}
        System.out.println(reverse);
    }

    //Lucky string or number (tyuiuyt). Decision.

    private static boolean isLucky(String str) {
        String reverse = "";
        for (var i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        for (var i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != reverse.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    // GetRemainder version 1
    private static int getRemainder(int a, int b) {
        boolean cond = true;
        if(a<b){
            return a;
        }
        while (cond){
            a= a-b;
            if(a<b){
                cond = false;
            }
        }
        return a;
    }

    //GetRemainder version 2
    private static int getRemainder1(int a, int b) {
        int x=a/b;
        return a-x*b;
    }


// FizzBuzz Version 1

    private static void fizzBuzz(int i) {
        if (i % 15 == 0) {
            System.out.println(i + " FizzBuzz");
        } else {
            if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else {
                if (i % 5 == 0) {
                    System.out.println(i + " Buzz");
                }
            }
        }
    }

    //FizzBuzz Version 2

    private static void fizzBuzz1(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " FizzBuzz");
        } else {
            if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            }
            if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
    }


//FizzBuzz Version 3

    private static void fizzBuzz2(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " FizzBuzz");
            return;
        }
        if (i % 3 == 0) {
            System.out.println(i + " Fizz");
            return;
        }
        if (i % 5 == 0) {
            System.out.println(i + " Buzz");
            return;
        }
    }
}


