package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal1 = factoryAnimal.getAnimal("Chó");
        System.out.println(animal1.makeSound());
        Animal animal2 = factoryAnimal.getAnimal("Mèo");
        System.out.println(animal2.makeSound());

    }
}
