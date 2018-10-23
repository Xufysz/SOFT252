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
public class Admin {

    public static void assignCourse(UniPeople person, Course course) {
        person.setCourse(course);
    }

    public static void getDetails(UniPeople person) {
        System.out.println(person.name + "\n" + person.id);
        if (person.getCourse() != null) {
            System.out.println(person.getCourse());
        }
    }
}
