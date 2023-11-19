package ro.scoalainformala.model;

import java.util.UUID;

public class Student implements Comparable<Student>{

    private UUID id;
    private String name;
    private String department;
    private int age;


    public Student(String name, String department, int age) {
        id = UUID.randomUUID();
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " and they study " + department;
    }

    @Override
    public int compareTo(Student s) {
        return this.name != null ?
                (s.name != null ?
                        this.name.compareTo(s.name) :
                        1) :
                -1;
    }
}
