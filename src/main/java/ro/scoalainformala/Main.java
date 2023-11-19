package ro.scoalainformala;

import ro.scoalainformala.model.Student;
import ro.scoalainformala.model.comparators.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Lucy", "Astrophysics", 25));
        students.add(new Student("Ryan", "Archeology", 28));
        students.add(new Student("Owen", "Letters", 24));

        Collections.sort(students, new StudentComparatorByDepartment());

        System.out.println("By department: ");

        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new StudentComparatorByAgeAscending());

        System.out.println("By age(+): ");

        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new StudentComparatorByAgeDescending());

        System.out.println("By age(-): ");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
