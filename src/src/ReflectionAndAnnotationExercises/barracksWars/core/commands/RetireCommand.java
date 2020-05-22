package src.ReflectionAndAnnotationExercises.barracksWars.core.commands;

import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.Repository;
import jdk.jshell.spi.ExecutionControl;

public class RetireCommand extends Command {

    private String[] data;
    private Repository repository;

    public RetireCommand() {

    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType=this.data[1];
        try {
            this.repository.removeUnit(unitType);
            return unitType+" retired!";
        }catch (IllegalStateException iae){
            return iae.getMessage();
        }

    }
}
