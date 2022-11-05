package L05Polymorphism.lab.P03Animals;

public class Cat extends Animal{

    protected Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + System.lineSeparator() + "MEEOW";
    }
}
