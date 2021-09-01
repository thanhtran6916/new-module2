package FactoryMethod;

public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if (type.equals("Chó")) {
            return new Dog();
        } else {
            return new Cat();
        }
    }

}
