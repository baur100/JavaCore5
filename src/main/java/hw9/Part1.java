package hw9;

public class Part1 {
    public static void main(String[] args) {
        Student student1 = new Student(11, "Maria", "Petrova", Course.API_MANAGEMENT, Object.BUSINESS_ENGLISH);
        student1.infoStudent();

        Student student2 = new Student(12, "Egor", "Fomin", Course.IT_ENGINEERING, Object.CODING_THEORY);
        student2.infoStudent();

        //TEACHERS
        Course[] cs1 = {Course.IT_ENGINEERING, Course.API_MANAGEMENT, Course.TEST_ENGINEERING};
        Teacher teacher1 = new Teacher("Ludmila", "Koval", 8, Object.CODING_THEORY, cs1);
        teacher1.couch();


        Course[] cs2 = {Course.IT_ENGINEERING, Course.API_MANAGEMENT};
        Teacher teacher2 = new Teacher("Sergey", "Lobanov", 12, Object.WEB_PROGRAMING, cs2);
        teacher2.couch();
    }
}

