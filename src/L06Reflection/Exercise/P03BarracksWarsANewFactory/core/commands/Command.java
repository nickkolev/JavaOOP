package L06Reflection.Exercise.P03BarracksWarsANewFactory.core.commands;

import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.Executable;

public abstract class Command implements Executable {

    private final String[] data;

    protected Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return this.data;
    }

}