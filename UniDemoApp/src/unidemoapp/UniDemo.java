/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemoapp;

import models.Admin;
import models.Course;
import models.Lecturer;
import models.Student;

/**
 *
 * @author kyler
 */
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lecturer teacher = new Lecturer(1, "Alma Rahat");
        Student student = new Student(1, "Kyle Rusby");
        Course course = new Course("SOFT252", "Babbage 209");

        System.out.println(student.id + " " + student.name);
        Admin.assignCourse(teacher, course);
        Admin.assignCourse(student, course);
        teacher.teach();
        student.attendClass();
        student.doCoursework();
        course.setCoursework("SOFT252 CODING");
        student.doCoursework();
        System.out.println(teacher.id + " " + teacher.name);
    }

}
