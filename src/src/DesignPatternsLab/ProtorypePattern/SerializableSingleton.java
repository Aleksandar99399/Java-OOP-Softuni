package src.DesignPatternsLab.ProtorypePattern;

import java.io.Serializable;

class SerializableSingleton implements Serializable {

    private static SerializableSingleton instance;

    private SerializableSingleton() {
    }

    public static synchronized SerializableSingleton getInstance() {

        if (instance == null) {

            instance = new SerializableSingleton();

        }

        return instance;

    }
}