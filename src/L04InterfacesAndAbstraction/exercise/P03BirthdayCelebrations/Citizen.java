package L04InterfacesAndAbstraction.exercise.P03BirthdayCelebrations;

import L04InterfacesAndAbstraction.exercise.P03BirthdayCelebrations.Interfaces.Birthable;
import L04InterfacesAndAbstraction.exercise.P03BirthdayCelebrations.Interfaces.Identifiable;
import L04InterfacesAndAbstraction.exercise.P03BirthdayCelebrations.Interfaces.Person;

public class Citizen implements Person, Identifiable, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
