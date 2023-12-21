package Chap_02;

import Chap_02.Bird;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.sound();

        Bird bird = new Bird();
        bird.move();
    }
}