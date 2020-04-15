package com.vetproject;

public class Porumbica extends Milena {

    public Porumbica(String ownerName) {
        super(ownerName);
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
