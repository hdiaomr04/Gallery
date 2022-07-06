package com.example.Mygallery.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Mygallery {
    @Id
    
    private Long Id;

    @Column(name = "Firstname")
    private String Firstname;

    
    @Column(name = "lastname")
    private String Lastname;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Email")
    private String Email;

    public Mygallery(){

    }

    public Mygallery(String firstname, String lastname, String email) {
        Firstname = firstname;
        Lastname = lastname;
        Email = email;
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getFirstname() {
        return Firstname;
    }
    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    
    
    
}
