package hw15;



public class App {
    public static void main(String[] args) {

        FictionBook tomSawyer = new FictionBook("Tom Sawyer", "Mark Twain", 55);

        System.out.println(tomSawyer.aboutFiction("Tom Sawyer"));
        tomSawyer.printOnParer();
        tomSawyer.hardCover();

        System.out.println("/");

        FictionBook hP = new FictionBook("Harry Potter", "Joan Roaling", 100);
        System.out.println(hP.aboutFiction("Harry Potter"));
        hP.hardCover();
        hP.printOnParer();

        System.out.println("////////");

        StudyBook al = new StudyBook("Easy Algebra", "math", 48);
        System.out.println(al.aboutStudy("Easy Algebra"));
        al.hardCover();
        al.printOnParer();

        System.out.println("/");

        StudyBook bio = new StudyBook("Biology", "nature", 45);
        System.out.println(al.aboutStudy("Biology"));
        al.hardCover();
        al.printOnParer();

        System.out.println("////////");


        Hardbook ol = new FictionBook("Oliver Twist", "Charles Dickens", 67);
        Hardbook art = new StudyBook("World modern art", "art", 77);

        Hardbook[] books = {ol, art};

        for (Hardbook v : books) {

            v.hardCover();
        }


    }
}


