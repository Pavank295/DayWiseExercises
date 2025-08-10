package com.wipro.oop.test;
import com.wipro.oop.Animal;
import com.wipro.oop.Human;
import com.wipro.oop.Bird;
import com.wipro.oop.Dog;
public class Animaltest {
    public static void main(String[] args) {
        Animal human = new Human("Pavan");
        Animal bird = new Bird("Parrot");
        Animal dog = new Dog("Snoopy");
        human.eat();
        human.makeSound();
        bird.eat();
        bird.makeSound();
        dog.eat();
        dog.makeSound();
    }
}