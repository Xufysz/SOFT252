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
public class Lecturer extends UniPeople implements ITeach {

    public Lecturer(Integer id, String name) {
        super(id, name);
    }

    @Override
    public void setCoursework(String coursework) {
        super.getCourse().setCoursework(coursework);
    }

    @Override
    public void teach() {
        System.out.println(super.name + " is teaching " + super.getCourse().getCode() 
                + " in room " + super.getCourse().getRoom());
    }
    
}
