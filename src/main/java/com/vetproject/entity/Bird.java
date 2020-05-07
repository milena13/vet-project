package com.vetproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "BIRD")
public class Bird extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bird_id")
    private long birdId;

    @Column(name = "bird_ecosystem")
    private String ecosystem;

    @Column(name = "endangered_or_not")
    private Boolean endangered;

    public long getBirdId() {return birdId;}

    public void setBirdId(long birdId) {this.birdId = birdId;}

    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    public Boolean getEndangered() {
        return endangered;
    }

    public void setEndangered(Boolean endangered) {
        this.endangered = endangered;
    }
}
