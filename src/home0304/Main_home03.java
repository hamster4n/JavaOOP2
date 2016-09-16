package home0304;

/**
 * Created by Hamster4n.
 * 1. Создайте класс описывающий человека (создайте метод выводящий информацию о человеке).
 * 2. На его основе создайте класс Студент (переопределите метод вывода).
 * 3. Создайте класс Группа - который содержит массив из 10 объектов класса студент.
 * Реализуйте методы добавления, удаления студента и метод поиска студента по фамилии.
 * В случае попытки добавления 11 студента создайте собственное исключение и обработайте его.
 * Определите метод toString() для группы так, чтобы он выводил список студентов в алфавитном порядке
 * 4. Нарисуйте UML диаграмму проекта.
 */
public class Main_home03 {
    public static void main(String[] args) {

       //test1
//        Human hum_man1 = new Human(true, 25, 70.3, 178.4,"Nikola");
//        Human hum_girl1 = new Human(false, 18, 54.2, 151.8,"Helga");
//
//        hum_man1.print();
//        hum_girl1.print();

        //test2
//        Student stud_man1 = new Student(true, 25, 70.3, 178.4, "Nikola", "GIS", 5, "Geodesy");
//        Student stud_gerl1 = new Student(false, 18, 54.2, 151.8, "Helga", "BUH", 3, "Accounting");
//
//        stud_man1.print();
//        stud_gerl1.print();


        Student stud_man1 = new Student(true, 25, 70.3, 178.4, "Nikola", "GIS", 5, "Geodesy");
        Student stud_man2 = new Student(true, 25, 75.0, 181.1, "Tolik", "GIS", 5, "Geodesy");
        Student stud_man3 = new Student(true, 25, 80.3, 178.0, "Yaroslav", "GIS", 5, "Geodesy");
        Student stud_man4 = new Student(true, 25, 90.3, 179.8, "Konstantin", "GIS", 5, "Geodesy");
        Student stud_man5 = new Student(true, 25, 82.3, 175.0, "Alex", "GIS", 5, "Geodesy");
        Student stud_man6 = new Student(true, 25, 85.7, 178.1, "Yura", "GIS", 5, "Geodesy");
        Student stud_gerl1 = new Student(false, 18, 54.2, 151.8, "Helga", "BUH", 3, "Accounting");
        Student stud_gerl2 = new Student(false, 18, 52.0, 149.6, "Julia", "BUH", 3, "Accounting");
        Student stud_gerl3 = new Student(false, 18, 55.1, 154.1, "Kat", "BUH", 3, "Accounting");
        Student stud_gerl4 = new Student(false, 18, 51.6, 150.5, "Svetlana", "BUH", 3, "Accounting");
        Student stud_gerl5 = new Student(false, 18, 59.9, 155.8, "Rita", "BUH", 3, "Accounting");
        Student stud_gerl6 = new Student(false, 18, 63.5, 145.7, "Margo", "BUH", 3, "Accounting");

        Group group = new Group("HONORS");
        System.out.println("***Test method addStudent*** \n");
        group.addStudent(stud_man1);
        group.addStudent(stud_gerl1);
        group.addStudent(stud_man2);
        group.addStudent(stud_gerl2);
        group.addStudent(stud_man3);
        group.addStudent(stud_gerl3);
        group.addStudent(stud_man4);
        group.addStudent(stud_gerl4);
        group.addStudent(stud_man5);
        group.addStudent(stud_gerl5);
        group.addStudent(stud_man6);
        group.addStudent(stud_gerl6);


        System.out.println("\n ***Test method searchStudentByName*** \n");
        group.searchStudentByName("Nikola");
        group.searchStudentByName("Oksana");


        System.out.println("\n ***Test method removeStudent(int number)*** \n");
        group.removeStudent(12);
        group.removeStudent(3);

        System.out.println("\n ***Test method removeStudent(Student student)*** \n");
        group.removeStudent(stud_man6);
        group.removeStudent(stud_man3);

        System.out.println("\n ***Print group*** \n");
        System.out.println(group);
    }
}
