package hw9;

public class Part1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.idStudent = 11;
        student1.name = "Maria";
        student1.lastname = "Petrova";
        student1.course = Course.API_MANAGEMENT;
        student1.object = Object.BUSINESS_ENGLISH;

        student1.information(11);

        Student student2 = new Student();
        student2.idStudent = 12;
        student2.name = "Egor";
        student2.lastname = "Fomin";
        student2.course = Course.IT_ENGINEERING;
        student2.object = Object.CODING_THEORY;

        student2.information(12);

        //TEACHERS
        Teacher teacher1 = new Teacher();
        teacher1.name = "Ludmila";
        teacher1.lastname = "Koval";
        teacher1.experience = 8;
        teacher1.object = Object.CODING_THEORY;


        teacher1.couch();
        Course[] cs = {Course.IT_ENGINEERING, Course.API_MANAGEMENT};  //НЕЛЬЗЯ ЗАПИХНУТЬ В ОБЪЕКТ
        for (Course y : cs) {
            System.out.println(y); //Почему печатаюся результаты двух арреев, хотя у них разные названия?

            Teacher teacher2 = new Teacher();
            teacher2.name = "Sergey";
            teacher2.lastname = "Lobanov";
            teacher2.experience = 12;
            teacher2.object = Object.WEB_PROGRAMING;


            teacher2.couch();
            Course[] css = {Course.IT_ENGINEERING, Course.TEST_ENGINEERING, Course.DEVELOPING};  //НЕЛЬЗЯ ЗАПИХНУТЬ В ОБЪЕКТ
            for (Course z : css) {                //Почему печатаюся результаты двух арреев, хотя у них разные названия?
                System.out.println(z);

            }
        }
    }
}
