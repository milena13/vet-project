package com.vetproject;

import com.vetproject.entity.Dog;
import com.vetproject.entity.Owner;

public class Main {

    public static void main(String []args) {

    Owner milena = new Owner();
   // milena.setOwnerId();
    milena.setName("Milena Mandru");

    Owner john = new Owner();
    john.setName("John Doe");

    Dog missy = new Dog();

    missy.setName("Missy");
    System.out.println("Name: " + missy.getName());

    missy.setBreed("Yorshire Terrier");
    System.out.println("Breed: " + missy.getBreed());

    missy.setAge(9);
    System.out.println("Age: " + missy.getAge());

    missy.setSize("Small");
    System.out.println("Size: " + missy.getSize());

    missy.setFur("Short and brown");
    System.out.println("Fur: " + missy.getFur());


    }
}
