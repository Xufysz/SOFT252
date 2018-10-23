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
public abstract class UniPeople {
    private Course course;
    public final Integer id;
    public final String name;

    public UniPeople(Integer id, String name){
        this.id = id;
        this.name = name;
    }
        
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
}
