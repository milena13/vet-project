package com.vetproject;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "ANIMAL")
abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Owner ownerId;

    @Column(name = "animal_name")
    private String name;

    @Column(name = "animal_breed")
    private String breed;

    @Column(name = "animal_age")
    private int age;


    public Animal() {
    }

    public Animal(Owner ownerId, String name, String breed, int age) {
        this.ownerId = ownerId;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Owner getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Owner ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
