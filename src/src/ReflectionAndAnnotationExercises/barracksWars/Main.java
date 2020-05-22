package src.ReflectionAndAnnotationExercises.barracksWars;

import src.ReflectionAndAnnotationExercises.barracksWars.core.CommandInterpreterImpl;
import src.ReflectionAndAnnotationExercises.barracksWars.core.Engine;
import src.ReflectionAndAnnotationExercises.barracksWars.core.factories.UnitFactoryImpl;
import src.ReflectionAndAnnotationExercises.barracksWars.data.UnitRepository;
import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.Repository;
import src.ReflectionAndAnnotationExercises.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = (Runnable) new Engine(new CommandInterpreterImpl(unitFactory,repository));
        engine.run();
    }
}
