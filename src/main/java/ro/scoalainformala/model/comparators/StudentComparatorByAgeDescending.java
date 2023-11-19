package ro.scoalainformala.model.comparators;

import ro.scoalainformala.model.Student;

import java.util.Comparator;

public class StudentComparatorByAgeDescending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        return s2.getAge() != 0 ?
                (s1.getAge() != 0 ?
                        Integer.compare(s2.getAge(), s1.getAge()) :
                        -1) :

                1;
    }
}

