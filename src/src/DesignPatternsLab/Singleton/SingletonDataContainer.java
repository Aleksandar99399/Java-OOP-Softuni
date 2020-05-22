package src.DesignPatternsLab.Singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonDataContainer implements SingletonContainer {
    private static  SingletonDataContainer instance;
    private Map<String,Integer> capitals;


    private SingletonDataContainer() {
        this.capitals = new HashMap<>();
        System.out.println("Initializing singleton object");
    }


    public int getPopulation(Map<String, Integer> capitals, String name) {
        return capitals.get(name);
    }

    // synchronized - гарантира, че няма две нишки да достъпят метода в еднаква микро секунда
    public static synchronized SingletonDataContainer getInstance() {
        if (instance != null){
            return instance;
        }
        instance = new SingletonDataContainer();
        return instance;
    }
}

