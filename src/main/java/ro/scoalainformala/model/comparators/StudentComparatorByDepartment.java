package ro.scoalainformala.model.comparators;

import ro.scoalainformala.model.Student;

import java.util.Comparator;

public class StudentComparatorByDepartment implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        return s1.getDepartment() != null ?
                (s1.getDepartment() != null ?
                        s1.getDepartment().compareTo(s2.getDepartment()) :
                        1) :
                -1;
    }
}

