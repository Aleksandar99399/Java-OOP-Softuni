package src.ReflectionAndAnnotationExercises.barracksWars.core;

import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.CommandInterpreter;
import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.Repository;
import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.Executable;
import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInterpreterImpl implements CommandInterpreter {
    private UnitFactory factory;
    private Repository repository ;
    public CommandInterpreterImpl(UnitFactory factory,Repository repository){
        this.factory=factory;
        this.repository=repository;
    }
    @Override
    public Executable interpretCommand(String[] data, String commandName) {
        Executable executable = null;

        try {
            Class<?> command = Class.forName(
                    getCorrectClassName("barracksWars.core.commands.", commandName));
            Constructor<?> ctor = command.getDeclaredConstructor(String[].class, UnitFactory.class, Repository.class);
            executable = (Executable) ctor.newInstance(data, this.factory , this.repository);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }


        return executable;
    }
    private String getCorrectClassName(String path, String commandName) {
        String substring = commandName.substring(1);
        commandName=Character.toUpperCase(commandName.charAt(0))+substring;

        return path + commandName + "Command";
    }
}
