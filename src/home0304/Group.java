package home0304;

import java.util.Arrays;

/**
 * Created by Hamster4n.
 */
public class Group {
    private String nameGroup;
    private Student[] group = new Student[10];

    public Group(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Group() {
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Student[] getGroup() {
        return group;
    }

    public void addStudent(Student student) {
        try {
            boolean isNullInGroup = false;
            for (Student element : group) {
                if (element == null) {
                    isNullInGroup = true;
                }
            }
            if (!isNullInGroup) throw new MyException();
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = student;
                    System.out.println("Student " + student.getName() + " added to " + getNameGroup() + " group.");
                    return;
                }
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }

    public void addStudentQuiet (Student student){
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null){
                group[i] = student;
                return;
            }
        }
    }

    public void removeStudent(Student student) {
        boolean isStudentInGroup = false;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].equals(student)) {
                    System.out.println("Student " + group[i].getName() + " is removed from " + getNameGroup() + " group.");
                    isStudentInGroup = true;
                    group[i] = null;
                }
            }
        }
        if (!isStudentInGroup) {
            System.out.println("There is no such student in the group!");
        }

    }

    public void removeStudent(int number) {
        if (number > -1 && number < 11) {
            if (group[number] != null) {
                System.out.println("Student " + group[number].getName() + " is removed from " + getNameGroup() + " group.");
                group[number] = null;
            } else System.out.println("There is no student in group with this number!");
        } else System.out.println("You type wrong number of student!");
    }

    public void searchStudentByName(String nameOfStudent) {
        boolean isStudentInGroup = false;
        for (Student element : group) {
            if (element != null) {
                if (nameOfStudent.equals(element.getName())) {
                    isStudentInGroup = true;
                    System.out.println("Computer found student: ");
                    element.print();
                }
            }
        }
        if (!isStudentInGroup) {
            System.out.println("Computer cant found student:");
            System.out.println("There is no such student " + nameOfStudent + " in the group!");
        }
    }



    @Override
    public String toString() {
//        Arrays.sort(group, Student.nameStudent);
        return  "nameGroup = " + nameGroup + "\n" + Arrays.toString(group);
    }
}
