package src.DesignPatternsLab.Singleton;

import java.util.HashMap;
import java.util.Map;

public class LazyDoubleCheckLockingSingleton {
    private static volatile LazyDoubleCheckLockingSingleton instance;
    private Map<String,Integer> capitals;


    private LazyDoubleCheckLockingSingleton() {
        this.capitals = new HashMap<>();
        System.out.println("Initializing singleton object");
    }

    public static LazyDoubleCheckLockingSingleton getInstance(){
        if (instance==null){
            synchronized (LazyDoubleCheckLockingSingleton.class){
                if (instance==null){
                    instance=new LazyDoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
