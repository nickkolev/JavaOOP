package L06Reflection.Exercise.P03BarracksWarsANewFactory;

import L06Reflection.Exercise.P03BarracksWarsANewFactory.core.CommandInterpreterImpl;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.core.Engine;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.core.factories.UnitFactoryImpl;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.data.UnitRepository;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.Repository;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.UnitFactory;

public class Main {
    public static void main(String[] args) {

        final Repository repository = new UnitRepository();

        final UnitFactory unitFactory = new UnitFactoryImpl();

        final CommandInterpreterImpl commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        final Engine engine = new Engine(commandInterpreter);

        engine.run();
    }
}