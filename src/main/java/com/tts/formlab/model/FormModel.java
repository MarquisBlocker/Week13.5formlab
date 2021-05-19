package com.tts.formlab.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.time.LocalDateTime;


public class FormModel implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String firstName;
    private String lastName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime launchDate;

    public FormModel() {
    }

    public FormModel(String title, String firstName, String lastName, LocalDateTime launchDate) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.launchDate = launchDate;
    }


    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDateTime launchDate) {
        this.launchDate = launchDate;
    }

    @Override
    public String toString() {
        return "FormModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", launchDate=" + launchDate +
                '}';
    }
}
