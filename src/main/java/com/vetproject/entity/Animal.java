package com.vetproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "ANIMAL")
public abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long animalId;

    @Column(name = "animal_name")
    private String name;

    @Column(name = "animal_breed")
    private String breed;

    @Column(name = "animal_age")
    private int age;


    public Animal() {
    }

    public Animal(long animalId, String name, String breed, int age) {
        this.animalId = animalId;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public long getOwnerId() {
        return animalId;
    }

    public void setOwnerId(long animalId) {
        this.animalId = animalId;
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
