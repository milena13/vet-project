package com.vetproject;

public class Milena {
    protected String ownerName;
    protected String petName;
    protected int age;
    protected String animalType;
    protected String breed;

    public Milena(String ownerName) {
        this.ownerName = ownerName;
        System.out.println("Owner: " + ownerName + ";");
    }

    public void setPetName(String name) {
        this.petName = name;
        System.out.println("Pet name: " + petName + ";");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age: " + age + ";");
    }

    public void setAnimalType(String type) {
        this.animalType = type;
        System.out.println("Animal type: " + animalType + ";");
    }

    public void setBreed (String breed) {
        this.breed = breed;
        System.out.println("Breed: " + breed + ".");
        System.out.println(" ");
    }

}
