package L04InterfacesAndAbstraction.exercise.P03BirthdayCelebrations;

import L04InterfacesAndAbstraction.exercise.P03BirthdayCelebrations.Interfaces.Birthable;

public class Pet implements Birthable {

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }
}
