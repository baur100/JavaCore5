package lesson15;

import java.util.SplittableRandom;

public class App {
    public static void main(String[] args) {
        String str ="Hello World";
        String sentence = new String("Hello my friends is good today");
        char[] characters = {'W','O','R','D'};
        String ww = new String(characters);
        System.out.println(ww);

        System.out.println(str.charAt(6));
        System.out.println(str.concat(ww));

        if (str!=ww){
            System.out.println("not equal");
        }
        if (!str.equals(ww)){
            System.out.println("not equal"); //лучший метод сравнения
        }

        System.out.println(sentence.contains("my"));
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.endsWith("rr"));
        System.out.println(sentence.startsWith("Hello"));

        String[]words = sentence.split(" ");
        System.out.println(words[3]);
        System.out.println(String.join("++",words));

        String sent1 = String.join("11",words);
        System.out.println(sent1);
        String[] wordsNew =sent1.split("11");

        System.out.println(sentence.substring(5,10));
        System.out.println("     xxxxxxxxxx      ".trim()); // уберает blank space

        System.out.println(sentence.replace("e","E"));

    }
}
