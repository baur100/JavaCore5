package work15;

public class work150 {
    public static void main(String[] args) {

        String str = "Hello World";
        String sentence = new String("Hello my friends  today is a beautiful weather");
        char[] charachters = {'w','o','r','d'};
        String ww = new String(charachters,1,2);
        System.out.println(ww);

        System.out.println(str.charAt(6));
        System.out.println(str.concat(ww));//Add strings
        System.out.println(str+ww);

//        if (str ! =ww){
//            System.out.println("not equal");
//        }




        if (!str.equals(ww)){
            System.out.println("not equal");
        }

        System.out.println(str.compareTo(str));
        System.out.println(sentence.contains("friends"));
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.endsWith("weather"));
        System.out.println(sentence.startsWith("Hello"));
        System.out.println(sentence.startsWith("llo", 2));
        System.out.println(sentence.indent(5)); //отступ
        System.out.println(" ".isBlank()); //True
        System.out.println(" ".isEmpty());
        System.out.println(sentence.length());
        System.out.println();

        String[] words = sentence.split(" ");
        System.out.println(words[3]);

        String sent1 = String.join("11", words);
        System.out.println(sent1);
        String[] wordsNew = sent1.split("11");

        System.out.println(sentence.substring(15,20));
        System.out.println("     xxxxxx    ".trim());

        System.out.println(sentence.replace("e", "E"));// замена символов



    }
}
