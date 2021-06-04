package com.oneleven.department;

import com.oneleven.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
    private String name;
    private String faculty;
    @Autowired
    private Student student;

    public Department() {
    }

    public Department(String name, String faculty, Student student) {
        this.name = name;
        this.faculty = faculty;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void display() {
        System.out.println("Department Display!");
        student.display();
    }


    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", student=" + student +
                '}';
    }
}
