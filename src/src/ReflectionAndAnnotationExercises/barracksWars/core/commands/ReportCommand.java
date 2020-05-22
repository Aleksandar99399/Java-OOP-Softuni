package src.ReflectionAndAnnotationExercises.barracksWars.core.commands;

import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.Repository;

public class ReportCommand extends Command {


    private Repository repository;

    public ReportCommand( ) {


    }

    @Override
    public String execute() {

        return this.repository.getStatistics();
    }
}
