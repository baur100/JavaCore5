package lesson15;
// Strings -это final класс с переменными immutable (не меняется)
public class Part1 {
    public static void main(String[] args) {
        String str = "Hello World!";
        String word = new String("Hello, my friends-today is a beautiful weather!");
        char[] characters = {'w', 'f', 'g', '&'};
        String ww = new String(characters);
        System.out.println(ww);
        System.out.println(str.charAt(6));  // возвращает букву по какомо ту индексу (действует как с арреем)
        System.out.println(str.concat(ww)); // .concat  складывает строки

       //Два способа сравнения строк
            if(str !=ww) {
                System.out.println("not equal");
            }
            if(str.equals((ww))){
                System.out.println("not equal");
            }
        System.out.println(str.compareTo(str)); // compare return always int
        System.out.println(word.contains("friends"));
        System.out.println(word.toLowerCase()); // все с маленькой буквы
        System.out.println(word.toUpperCase()); // все с большой строки
        System.out.println(word.endsWith("weather!")); // сравнивание окончание выражения,строки
        System.out.println(word.startsWith("Hello")); // сравнивает начало строки
        System.out.println(word.startsWith("llo",2)); // сравнивание со сдвигов на 2 индекса
        System.out.println(word.indent(5)); // ставит 5 или заданное количество отступов перед строкой
        System.out.println("  ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(word.length());

        String[] words = word.split(" "); // удаляет все пробелы между словами, слипается предложение
        System.out.println(words[3]);
        System.out.println(String.join("++",words)); // разделяет слова ++ или другими символами

        System.out.println(word.substring(15,20)); // печатает знаки между двумя указанными значениями
        System.out.println("        xxx        ".trim());    //trim  убирает blank space спереди и сзади
        System.out.println(word.replace("e","E"));  //заменяет что то старое на новое, указанное в значениях функции

    }

    }

