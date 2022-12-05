package L06Reflection.Exercise.P03BarracksWarsANewFactory.core.commands;


import L06Reflection.Exercise.P03BarracksWarsANewFactory.annotations.Inject;

import java.lang.reflect.InvocationTargetException;

import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.Repository;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.Unit;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Add extends Command {

    @Inject
    private Repository repository;

    @Inject
    private UnitFactory unitFactory;

    public Add(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws ClassNotFoundException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            InvocationTargetException,
            ExecutionControl.NotImplementedException {

        final String unitType = getData()[1];

        final Unit unitToAdd = this.unitFactory.createUnit(unitType);

        this.repository.addUnit(unitToAdd);

        return unitType + " added!";
    }
}