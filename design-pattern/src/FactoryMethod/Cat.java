package FactoryMethod;

public class Cat extends Animal{
    @Override
    String makeSound() {
        return "meo";
    }
}
