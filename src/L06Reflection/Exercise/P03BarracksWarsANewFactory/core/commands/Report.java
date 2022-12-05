package L06Reflection.Exercise.P03BarracksWarsANewFactory.core.commands;

import L06Reflection.Exercise.P03BarracksWarsANewFactory.annotations.Inject;
import L06Reflection.Exercise.P03BarracksWarsANewFactory.interfaces.Repository;

public class Report extends Command {

    @Inject
    private Repository repository;

    public Report(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}