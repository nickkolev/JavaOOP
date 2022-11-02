package L03Inheritance.lab.P03HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.eat();

        dog.bark();
        cat.meow();
    }
}
