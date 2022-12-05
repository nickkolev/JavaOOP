package L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces;

public interface CommandInterpreter {

	@SuppressWarnings("unchecked")
	Executable interpretCommand(String[] data);

	Executable interpretCommand(String[] data, String commandName);
}
