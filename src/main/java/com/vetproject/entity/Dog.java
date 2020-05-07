package com.vetproject.entity;

import com.vetproject.entity.Animal;

import javax.persistence.*;

@Entity
@Table(name = "DOG")
public class Dog extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dogId;

    @Column(name = "dog_size")
    private String size;

    @Column(name = "dog_fur")
    private String fur;

    @Column(name = "trained_or_not")
    private Boolean trained;



    public long getDogId() {return dogId;}

    public void setDogId(long dogId) {this.dogId = dogId;}

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public Boolean getTrained() {
        return trained;
    }

    public void setTrained(Boolean trained) {
        this.trained = trained;
    }
}
