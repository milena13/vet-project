package com.vetproject.entity;

import com.vetproject.entity.Animal;

import javax.persistence.*;

@Entity
@Table(name = "REPTILE")
public class Reptile extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reptile_id")
    private long reptileId;

    @Column(name = "food_preference")
    private String foodPreference;

    @Column(name = "reptile_ecosystem")
    private String ecosystem;

    public long getReptileId() {return reptileId;}

    public void setReptileId(long reptileId) {this.reptileId = reptileId;}

    public String getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }
}
