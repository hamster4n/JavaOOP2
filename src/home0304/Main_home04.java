package home0304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Hamster4n.
 * 1. Усовершенствуйте класс Group добавив возможность интерактивного добавления объекта.
 * 2. Реализуйте возможность сортировки списка студентов по фамилии.
 * 3. Реализуйте возможность сортировки по параметру (Фамилия, успеваемость и т.д.)
 * 4. Реализуйте интерфейс Военком, который вернёт из группы массив студентов юношей, которым больше 18 лет.
 * 5. Протестируйте работу программы.
 */
public class Main_home04 {
    public static void main(String[] args) throws IOException {
        Group group = createGroupQuiet();
        group.addStudent(createNewStudent());
    }

    public static Student createNewStudent() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Please input data about new student: ");

                    System.out.println("Input sex(true/false): ");
                        boolean inputSex = Boolean.valueOf(reader.readLine());
                    System.out.println("Input age(int): ");
                        int inputAge = Integer.valueOf(reader.readLine());
                    System.out.println("Input weight(double): ");
                        double inputWeight = Double.valueOf(reader.readLine());
                    System.out.println("Input growth(double): ");
                        double inputGrowth = Double.valueOf(reader.readLine());
                    System.out.println("Input name(string): ");
                        String inputName = reader.readLine();
                    System.out.println("Input group(string): ");
                        String inputGroup = reader.readLine();
                    System.out.println("Input course(int): ");
                        int inputCourse = Integer.valueOf(reader.readLine());
                    System.out.println("Input department(string): ");
                        String inputDepartment = reader.readLine();
                    Student student = new Student(inputSex, inputAge, inputWeight, inputGrowth, inputName, inputGroup, inputCourse, inputDepartment);
                    reader.close();
                    return student;
    }

    public static Group createGroupQuiet(){
        Student stud_man1 = new Student(true, 25, 70.3, 178.4, "Nikola", "GIS", 5, "Geodesy");
        Student stud_man2 = new Student(true, 25, 75.0, 181.1, "Tolik", "GIS", 5, "Geodesy");
        Student stud_man3 = new Student(true, 25, 80.3, 178.0, "Yaroslav", "GIS", 5, "Geodesy");
        Student stud_man4 = new Student(true, 25, 90.3, 179.8, "Konstantin", "GIS", 5, "Geodesy");
        Student stud_gerl1 = new Student(false, 18, 54.2, 151.8, "Helga", "BUH", 3, "Accounting");
        Student stud_gerl2 = new Student(false, 18, 52.0, 149.6, "Julia", "BUH", 3, "Accounting");
        Student stud_gerl3 = new Student(false, 18, 55.1, 154.1, "Kat", "BUH", 3, "Accounting");
        Student stud_gerl4 = new Student(false, 18, 51.6, 150.5, "Svetlana", "BUH", 3, "Accounting");


        Group group = new Group("HONORS");

        group.addStudentQuiet(stud_man1);
        group.addStudentQuiet(stud_gerl1);
        group.addStudentQuiet(stud_man2);
        group.addStudentQuiet(stud_gerl2);
        group.addStudentQuiet(stud_man3);
        group.addStudentQuiet(stud_gerl3);
        group.addStudentQuiet(stud_man4);
        group.addStudentQuiet(stud_gerl4);
        return group;
    }
}
