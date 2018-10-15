/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentapp;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author krusby
 */
public class Appointment {

    private LocalDateTime dateTime;
    private Duration duration;
    private String comment;

    public Appointment(LocalDateTime time, Duration length, String aComment) {
        this.dateTime = time;
        this.duration = length;
        this.comment = aComment;
    }
}
