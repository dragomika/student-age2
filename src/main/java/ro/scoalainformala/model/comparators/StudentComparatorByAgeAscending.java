package ro.scoalainformala.model.comparators;

import ro.scoalainformala.model.Student;

import java.util.Comparator;

public class StudentComparatorByAgeAscending implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        return s1.getAge() != 0 ?
                (s2.getAge() != 0 ?
                        Integer.compare(s1.getAge(), s2.getAge()) :
                        1) :

                -1;
    }
}

