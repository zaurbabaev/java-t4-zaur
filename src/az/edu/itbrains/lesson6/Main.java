package az.edu.itbrains.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Zaur");
        student1.setSurname("Babayev");
        student1.setAge(37);
        student1.setPoint(70);
        student1.setCardNumber("1111222233334444");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Mike");
        student2.setSurname("Mouse");
        student2.setAge(14);
        student2.setPoint(50);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);

        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }

        System.out.println();

        System.out.println(students.get(0).getName());
        System.out.println(students.get(1).getName());

        System.out.println(students);


        System.out.println(student1.hesabla());
        System.out.println(student2.hesabla());

        System.out.println(student1.getCardNumber());
    }
}
