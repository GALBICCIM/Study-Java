package Chap_03;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Dogg(),
                new Catt(),
                new Coww()
        };

        for (Animal animal : animals) {
            animal.sound();
        }


    }
}