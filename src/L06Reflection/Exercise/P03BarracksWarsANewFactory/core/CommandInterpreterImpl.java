package L06Reflection.Exercise.P03BarracksWarsANewFactory.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import L06Reflection.Exercise.P03BarracksWarsANewFactory.annotations.Inject;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.CommandInterpreter;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.Executable;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.Repository;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.UnitFactory;

public class CommandInterpreterImpl implements CommandInterpreter {

    private static final String COMMAND_PACKAGE = "barracksWars.core.commands.";

    private final Repository repository;

    private final UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Executable interpretCommand(String[] data) {
        final String commandName = Character.toUpperCase(data[0].charAt(0)) + data[0].substring(1);
        Executable executable = null;

        try {
            final Class<? extends Executable> commandClass = (Class<? extends Executable>)
                    Class.forName(CommandInterpreterImpl.COMMAND_PACKAGE + commandName);

            final Constructor<? extends Executable> constructor = commandClass.getDeclaredConstructor(String[].class);
            constructor.setAccessible(true);

            executable = constructor.newInstance(new Object[]{data});

            final Field[] executableFields = executable.getClass().getDeclaredFields();

            final Field[] thisCommandImpl = this.getClass().getDeclaredFields();

            for (Field executableField : executableFields) {
                if (executableField.isAnnotationPresent(Inject.class)) {
                    for (Field field : thisCommandImpl) {
                        if (executableField.getType().equals(field.getType())) {
                            executableField.setAccessible(true);
                            executableField.set(executable, field.get(this));
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return executable;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        return null;
    }
}