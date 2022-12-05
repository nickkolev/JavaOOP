package L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces;

import L06Reflection.Exercise.P03BarracksWarsANewFactory.core.commands.Command;

import java.lang.reflect.InvocationTargetException;

public interface CommandFactory {
    Command createCommand(String commandName, String[] data) throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException;
}