package src.ReflectionAndAnnotationExercises.barracksWars.core.commands;

import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.Repository;
import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.Unit;
import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.UnitFactory;

public class AddCommand extends Command {
    private String[]data;
    private UnitFactory factory;
    private Repository repository;


    public AddCommand(){

    }

    @Override
    public String execute() {
        String unitType = this.data[1];
        Unit unitToAdd = this.factory.createUnit(unitType);
        this.repository .addUnit(unitToAdd);

        return unitType + " added!";
    }
}
