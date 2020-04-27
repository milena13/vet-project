package com.vetproject;

public class Main {

    public static void main(String []args) {

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

    Cat izzy = new Cat();

    Bird tweety = new Bird();

    Reptile lizzy = new Reptile();

    lizzy.setEcosystem("Desert");
    System.out.println("Lizzy is a reptile and it's ecosystem is: " + lizzy.getEcosystem());

    }
}
