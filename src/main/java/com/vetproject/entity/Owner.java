package com.vetproject.entity;

import com.vetproject.entity.Animal;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "OWNER")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Owner_Id")
    private long ownerId;
    @Column(name = "Owner_Name")
    private String name;
    @Column(name = "E-mail address")
    private String email;
    @Column(name = "Phone_Number")
    private String phoneNumber;

    @OneToMany
    private List<Animal> animals;

   // @Query("SELECT milena FROM Owner milena WHERE milena.name = Milena Mandru ")


    public Owner() {
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
