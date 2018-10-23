/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author kyler
 */
public class Student extends UniPeople {

    public Student(Integer id, String name) {
        super(id, name);
    }

    public void attendClass() {
        System.out.println(super.name + " is attending " + super.getCourse().getCode()
                + " in room " + super.getCourse().getRoom());
    }

    public void doCoursework() {
        System.out.println(super.name + " is doing coursework " + super.getCourse().getCoursework());
    }
}
