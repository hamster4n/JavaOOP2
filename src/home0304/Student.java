package home0304;

import java.util.Comparator;

/**
 * Created by Hamster4n.
 */
public class Student extends Human {
    private String group;
    private int course;
    private String department;

    public Student(boolean sex, int age, double weigth, double growth, String name, String group, int course, String department) {
        super(sex, age, weigth, growth, name);
        this.group = group;
        this.course = course;
        this.department = department;
    }

    public Student() {
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void print() {
        System.out.println("My name is " + super.getName() + ". I am learning in " + group + " group, " + course +
        " course, " + department + " department.");
    }

    @Override
    public String toString() {
        return super.getName() + "\n";
    }


//    @Override
//    public int compareTo(Student student) {
//        if (student == null){
//            return -1;
//        } else return this.getName().compareTo(student.getName());
//
//    }

    public static Comparator<Student> nameStudent = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1 == null ){
                return 1;
            } else if (o2 == null){
                return -1;
            } else return o1.getName().compareTo(o2.getName());

        }
    };


}
