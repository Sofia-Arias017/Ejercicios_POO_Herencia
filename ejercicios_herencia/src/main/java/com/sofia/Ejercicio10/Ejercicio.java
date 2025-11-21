package com.sofia.Ejercicio10;

import java.util.ArrayList;

import com.sofia.Ejercicio3.Animal;
import com.sofia.Ejercicio3.Cat;
import com.sofia.Ejercicio3.Dog;
import com.sofia.Ejercicio6.Bird;

public class Ejercicio {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();

    animal.add(new Dog());
    animal.add(new Cat());
    animal.add(new Bird());

    for (Animal s : animal) {
        s.makeSound();
    }
    }
}
